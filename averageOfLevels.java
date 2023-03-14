class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> al = new ArrayList<>();
        if(root == null)
        return al;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int n = q.size();
            double d = 0.0;
            int level = 0;
            while(n-- > 0)
            {
                TreeNode node = q.poll();
                d += node.val;
                level++;

                if(node.left != null)
                q.add(node.left);

                if(node.right != null)
                q.add(node.right);
            }
            al.add(d / level);
        }

        return al;
    }
}
