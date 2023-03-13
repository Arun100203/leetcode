/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        helper(root, 0);
        return li;
    }
    void helper(Node root, int level)
    {
        if(root == null)
        return;
        
        if(level >= li.size())
        li.add(new ArrayList<>());

        li.get(level).add(root.val);

        for(Node i : root.children)
        helper(i, level + 1);
    }
}
