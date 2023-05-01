class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int v = graph.length;
        int out[] = new int[v];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++)
        {
            adj.add(new ArrayList<>());
            out[i] = graph[i].length;
        }

        
        for(int i=0;i<v;i++)
        {
            int n = out[i];
            for(int j=0;j<n;j++)
            {
                adj.get(graph[i][j]).add(i);
            }
        }

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<v;i++)
        if(out[i] == 0)
        q.add(i);

        while(q.size() != 0)
        {
            int front = q.poll();
            ans.add(front);
            for(int i:adj.get(front))
            {
                out[i] --;
                if(out[i] == 0)
                q.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
