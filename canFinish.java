class Solution {
    public boolean canFinish(int n, int[][] p) {
         List<List<Integer>> li = new ArrayList<>();
         for(int i=0;i<n;i++)
            li.add(new ArrayList<>());

         int in[] = new int[n];
         for(int i=0;i<p.length;i++)
            li.get(p[i][0]).add(p[i][1]);

         for(int i=0;i<n;i++)
            for(int j:li.get(i))
                in[j]++;

         Queue<Integer> q = new LinkedList<>();
         for(int i=0;i<in.length;i++)
            if(in[i]==0)
                q.offer(i);

         int count = 0;
         while(q.size()!=0)
         {
             int node = q.poll();
             count++;
             for(int i:li.get(node))
             {
                    in[i]--;
                    if(in[i]==0)
                        q.offer(i);
             }
             
                    
         }

         return count == n ? true : false;
    }
}
