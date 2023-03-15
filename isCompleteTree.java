class Solution {
    public boolean isCompleteTree(TreeNode root) {
        List al = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int lev = 0;
        while(!q.isEmpty())
        {
            int n = q.size();
            
            while(n-- > 0)
            {
                TreeNode node = q.poll();
                try{
                    al.add(node.val);
                }
                catch(Exception e){ al.add(null); }
                if(node != null)
                q.add(node.left);
                if(node != null)
                q.add(node.right);
            }
            
        }
        System.out.println(al);
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i) == null)
            {
                for(int j=i;j<al.size();j++)
                {
                    if(al.get(j) == null)
                    continue;
                    else
                    return false;
                }
            }
        }
        return true;
    }
}
