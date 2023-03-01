package myproject;
import java.util.*;

public class DijkstraAlgorithm {

    private int V;
    private List<List<Node>> adj;
    private int[] dist;
    private boolean[] visited;

    public DijkstraAlgorithm(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<>();
            adj.add(item);
        }
        dist = new int[V];
        visited = new boolean[V];
    }

    public void addEdge(int u, int v, int w) {
        adj.get(u).add(new Node(v, w));
        adj.get(v).add(new Node(u, w));
    }

    public void shortestPath(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>(V, Comparator.comparingInt(node -> node.weight));
        pq.add(new Node(start, 0));
        dist[start] = 0;
        while (!pq.isEmpty()) {
            int u = pq.poll().node;
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            for (Node neighbor : adj.get(u)) {
                int v = neighbor.node;
                int weight = neighbor.weight;
                int distanceThroughU = dist[u] + weight;
                if (distanceThroughU < dist[v]) {
                    dist[v] = distanceThroughU;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }
    }
    
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j).node );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5;
        int start;
        Scanner sc = new Scanner(System.in);
        DijkstraAlgorithm graph = new DijkstraAlgorithm(V);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 4, 3);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 4, 4);
        graph.addEdge(2, 3, 9);
        graph.addEdge(3, 2, 7);
        graph.addEdge(4, 1, 1);
        graph.addEdge(4, 2, 8);
        graph.addEdge(4, 3, 2);
        System.out.println("The graph looks like");
        graph.printGraph();
        System.out.println("Which node you like");
        graph.dist = new int[V];
        Arrays.fill(graph.dist, Integer.MAX_VALUE);
        try {
        	start = sc.nextInt();
        
        graph.shortestPath(start);
        for (int i = 0; i < V; i++) {
            System.out.println("Shortest distance from " + start + " to " + i + " is " + graph.dist[i]);
        }
        }catch(Exception e) {
        	System.out.println("Enter Valid a Node, Valid nodes are 0, 1, 2, 3, 4");
        }
    }

    class Node {
        int node;
        int weight;

        public Node(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
        public Node(int node) {
            this.node = node;
            this.weight = 0;
        }
    }
}
