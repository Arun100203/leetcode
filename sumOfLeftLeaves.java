class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
        return 0;
        else if(root.left != null && root.left.right == null && root.left.left == null)
        return root.left.val + sumOfLeftLeaves(root.right);
        else
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
