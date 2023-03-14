class Solution {
    record Node(int i, int t) {}
    public int networkDelayTime(int[][] times, int n, int k) {
        // create graph
        List<Node>[] g = new List[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (var t : times) g[t[0]-1].add(new Node(t[1]-1, t[2]));

        int[] time = new int[n];
        Queue<Integer> q = new PriorityQueue<>((u, v) -> time[u]-time[v]);
        Arrays.fill(time, Integer.MAX_VALUE);
        time[--k] = 0;
        q.offer(k);

        while (!q.isEmpty()) {
            var cur = q.poll();
            for (var next : g[cur]) {
                int t2 = time[cur] + next.t;
                if (t2 >= time[next.i]) continue;
                time[next.i] = t2;
                q.offer(next.i);
            }
        }

        int res = time[0];
        for (var t : time) if (t == Integer.MAX_VALUE) return -1; else if (t > res) res = t;
        return res;
    }
}
