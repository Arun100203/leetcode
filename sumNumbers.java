class Solution {
    List<String> li = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        helper(root, "");
        //System.out.println(li);
        int ans = 0;
        for(String s: li)
        ans += Integer.parseInt(s);
        return ans;
    }
    void helper(TreeNode root, String curr)
    {
        if(root == null) return;
        if(root.left == null && root.right == null)
        li.add(curr + root.val);
        helper(root.left, curr + root.val);
        helper(root.right, curr + root.val);
    }
}
