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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        return true;

        if(!helper(root))
        return false;

        return isBalanced(root.left) && isBalanced(root.right);

    }
    boolean helper(TreeNode root)
    {
        if(root == null)
        return true;
        int right = 0;
        right = depth(root.right, 0);

        int left = 0;
        left = depth(root.left, 0);
        //System.out.println(left+" "+right);
        return Math.abs(left - right) <=1 ? true : false;
    }
    int depth(TreeNode root, int h)
    {
        if(root == null)
        return h;
        //System.out.println(root.val+" "+h);
        return Math.max(depth(root.right, h+1), depth(root.left, h+1));
    }
}
