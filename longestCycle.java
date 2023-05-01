class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        boolean[] visited = new boolean[n];
        int[] indegree = new int[n];

        // Count indegree of each node.
        for (int i : edges) {
            if (i != -1) {
                indegree[i]++;
            }
        }

        // Kahn's algorithm starts.
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            visited[node] = true;
            int front = edges[node];
            if (front != -1) {
                indegree[front]--;
                if (indegree[front] == 0) {
                    q.offer(front);
                }
            }
        }
        // Kahn's algorithm ends.

        int answer = -1;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int front = edges[i];
                int count = 1;
                visited[i] = true;
                // Iterate in the cycle.
                while (front != i) {
                    visited[front] = true;
                    count++;
                    front = edges[front];
                }
                answer = Math.max(answer, count);
            }
        }
        return answer;
    }
}
