import java.util.*;

class DijkstraSSSP {
    private static final int INF = Integer.MAX_VALUE;
    
    public static void dijkstra(int[][] graph, int src, int V) {
        int[] dist = new int[V]; // Stores shortest distances
        boolean[] sptSet = new boolean[V]; // Tracks included vertices
        
        Arrays.fill(dist, INF);
        dist[src] = 0;
        
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet, V);
            sptSet[u] = true;
            
            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        
        printSolution(dist, V);
    }
    
    private static int minDistance(int[] dist, boolean[] sptSet, int V) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!sptSet[v] && dist[v] < min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    
    private static void printSolution(int[] dist, int V) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t " + dist[i]);
        }
    }
    
    public static void main(String[] args) {
        int V = 5;
        int[][] graph = {
            {0, 10, 0, 5, 0},
            {10, 0, 1, 2, 0},
            {0, 1, 0, 0, 4},
            {5, 2, 0, 0, 3},
            {0, 0, 4, 3, 0}
        };
        
        int src = 0;
        dijkstra(graph, src, V);
    }
}
