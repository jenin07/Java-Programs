import java.util.Arrays;

public class PA {

    // Number of vertices in the graph
    private static final int V = 5;

    // Function to find the vertex with the minimum key value
    int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Function to print the MST
    void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    // Function to construct and print MST using Prim's algorithm
    void primMST(int[][] graph) {
        int[] parent = new int[V]; // Array to store the MST
        int[] key = new int[V];    // Key values used to pick the minimum weight edge
        boolean[] mstSet = new boolean[V]; // To represent the set of vertices not yet included in MST

        // Initialize all keys as INFINITE
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;     // Include the first vertex in MST by setting its key to 0
        parent[0] = -1; // First node is always the root of the MST

        // The MST will have V vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum key vertex from the set of vertices not yet included in MST
            int u = minKey(key, mstSet);
            mstSet[u] = true; // Add the picked vertex to the MST set

            // Update key values and parent indices of the adjacent vertices of the picked vertex
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        // Print the MST
        printMST(parent, graph);
    }

    public static void main(String[] args) {
        PA prim = new PA();
        int[][] graph = {
            { 0, 2, 0, 6, 0 },
            { 2, 0, 3, 8, 5 },
            { 0, 3, 0, 0, 7 },
            { 6, 8, 0, 0, 9 },
            { 0, 5, 7, 9, 0 }
        };

        // Print the solution
        prim.primMST(graph);
    }
}
