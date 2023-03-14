class Solution {
    List<String> li = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        
        helper(root, "");
        for(int i=0;i<li.size();i++)
        li.set(i, li.get(i).substring(2));
        return li;
    }
    void helper(TreeNode root , String curr)
    {
        if(root == null)
        return;

        if(root.left == null && root.right == null)
        li.add(curr + "->" + root.val );
        
        helper(root.left, curr + "->" + root.val);
        helper(root.right, curr + "->" + root.val);
    }
}
