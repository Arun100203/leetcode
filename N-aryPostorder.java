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
    List<Integer> li = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        helper(root);
        return li;
    }
    void helper(Node root)
    {
        if(root == null )
        return;
        for(Node i: root.children)
        helper(i);
        li.add(root.val);
    }
}
