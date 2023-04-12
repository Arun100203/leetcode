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
    List<List<Integer>> li = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        helper(root);
        List<Integer> ans = new ArrayList<>();
        System.out.println(li);
        for(List<Integer> i:li)
        if(i.size() != 0)
        ans.add(i.get(0));
        return ans;
    }
    void helper(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(q.size() != 0)
        {
            int t = q.size();
            List<Integer> te = new ArrayList<>();
            while(t-- > 0)
            {
                TreeNode temp = q.poll();
                
                if(temp == null) continue;

                if(temp.right != null)
                q.offer(temp.right);

                if(temp.left != null)
                q.offer(temp.left);

                te.add(temp.val);
            }
            li.add(te);
        }
    }
}
