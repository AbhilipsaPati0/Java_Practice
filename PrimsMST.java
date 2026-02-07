import java.util.*;

class PrimsMST {
    private static final int INF = Integer.MAX_VALUE;
    
    public static void primMST(int[][] graph, int V) {
        int[] key = new int[V]; // Key values to pick the minimum weight edge
        int[] parent = new int[V]; // Stores the MST
        boolean[] inMST = new boolean[V]; // Track vertices included in MST
        
        Arrays.fill(key, INF);
        key[0] = 0;
        parent[0] = -1;
        
        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, inMST, V);
            inMST[u] = true;
            
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !inMST[v] && graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                    parent[v] = u;
                }
            }
        }
        
        printMST(parent, graph, V);
    }
    
    private static int minKey(int[] key, boolean[] inMST, int V) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!inMST[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    
    private static void printMST(int[] parent, int[][] graph, int V) {
        System.out.println("Minimum Spanning Tree:");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + " : " + graph[i][parent[i]]);
        }
    }
    
    public static void main(String[] args) {
        int V = 5;
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };
        
        primMST(graph, V);
    }
}
