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
    String res = "";
    public String tree2str(TreeNode root) {
        helper(root);
        return res;
    }
    void helper(TreeNode root)
    {
        if(root == null)
        return;

        res += root.val;

        if(root.left ==null && root.right == null)
        return;

        res += '(';
        helper(root.left);
        res += ')';
        
        if(root.right != null)
        {
            res += '(';
            helper(root.right);
            res += ')';
        }
    }
}
