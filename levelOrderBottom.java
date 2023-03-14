class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        if(root == null)
        return al;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> temp = new ArrayList<>();
            while(n-- > 0)
            {
                TreeNode node = q.poll();
                try{
                    temp.add(node.val);
                }
                catch(Exception e){}
                
                if(node.left != null)
                q.offer(node.left);

                if(node.right != null)
                q.offer(node.right);
            }
            al.add(temp);
        }
        Collections.reverse(al);
        return al;
    }
}
