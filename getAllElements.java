/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> li1 = new ArrayList<>();
    List<Integer> li2 = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        helper(root1, li1);
        helper(root2, li2);
        //System.out.println(li1);
        int in = 0;
        for(int i:li2)
        li1.add(i);
        Collections.sort(li1);
        return li1;
    }
    void helper(TreeNode root, List<Integer> li)
    {
        if(root == null)
        return;
        helper(root.left, li);
        li.add(root.val);
        helper(root.right, li);
    }
}
