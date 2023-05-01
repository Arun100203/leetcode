class Solution {
    public int[] findOrder(int n, int[][] p) {
        List<List<Integer>> adj = new ArrayList<>();
        int indeg[] = new int[n];
        int ans[] = new int[n];

        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int i=0;i<p.length;i++)
        adj.get(p[i][0]).add(p[i][1]);

        for(int i=0;i<n;i++)
        for(int j:adj.get(i))
        indeg[j]++;

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++)
        if(indeg[i] == 0)
        q.offer(i);
       
        int cnt = n;
        ArrayList<Integer> sorted = new ArrayList<>();
        while(q.size() != 0)
        {
                int node = q.poll();
                sorted.add(node);
                for(int i:adj.get(node))
                {
                        indeg[i]--;
                        if(indeg[i]==0)
                            q.offer(i);
                }
        }
       if(sorted.size() != n)
            return new int[0];
        int arr[] = new int[sorted.size()]; 
        int in=0;
        for(int i=sorted.size()-1;i>=0;i--)
            arr[in++] = sorted.get(i);
        return arr;
    }
}
