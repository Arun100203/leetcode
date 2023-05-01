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
    int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return ans;
    }
    int helper(TreeNode root)
    {
        if(root == null)
        return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int tempLeft = 0, tempRight = 0;

        if(root.left != null && root.val == root.left.val)
        tempLeft += left + 1;

        if(root.right != null && root.val == root.right.val)
        tempRight += right + 1;
        
        ans = Math.max(ans, tempLeft + tempRight);
        return Math.max(tempLeft, tempRight);
    }
}
