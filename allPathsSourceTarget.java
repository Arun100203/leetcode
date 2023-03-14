class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      Map<Integer, List<Integer>> edges = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                edges.computeIfAbsent(i, val -> new ArrayList<>()).add(graph[i][j]);
            }
        }
        System.out.println(edges);
        helper(edges, new ArrayList<>(), 0, graph.length - 1);
        return li;
    }
    void helper(Map<Integer, List<Integer>> edges, List<Integer> temp, int source, int destination)
    {
        temp.add(source);
        if(source == destination)
        li.add(temp);

        List<Integer> al = edges.get(source);
        if(al == null) return;
        
        for(int node: al)
        helper(edges, new ArrayList<>(temp), node, destination);
    }
}
