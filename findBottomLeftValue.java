class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public int findBottomLeftValue(TreeNode root) {
        helper(root, 0);
        System.out.println(li);
        return li.get(li.size()-1).get(0);
    }
    void helper(TreeNode root, int level)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(q.size()!=0)
        {
            int n = q.size();
            List<Integer> temp = new ArrayList<>();
            while(n-- > 0)
            {
                TreeNode node = q.poll();
                temp.add(node.val);

                if(node.left != null)
                q.offer(node.left);

                if(node.right != null)
                q.offer(node.right);
            }
            li.add(temp);
        }
    }
}
