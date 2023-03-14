class Solution {
     List<List<Integer>> al = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       
        helper( new ArrayList<>(), root, targetSum);
        return al;
    }
    void helper(List<Integer> li, TreeNode root, int targetSum)
    {
        if(root == null)
        return;
        li.add(root.val);
        if(root.left == null && root.right == null)
        {
            int sum = 0;
            for(int i: li)
            sum+= i;
            if(sum == targetSum)
            al.add(li);
        }
        helper(new ArrayList<>(li), root.left, targetSum);
        helper(new ArrayList<>(li), root.right, targetSum);
    }
}
