class Solution {
    Set<Integer> set = new TreeSet<>();
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        
        List<Integer> li = new ArrayList<>(set);
        return li.get(k-1);
    }
    void helper(TreeNode root)
    {
        if(root == null)
        return;

        set.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}
