
// prims algorithm
import java.util.*;

public class CA2 {

    private static final int v = 5;

    int minkey(int key[], boolean[] mstset) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < v; i++) {
            if (!mstset[i] && key[i] < min) {
                min = key[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    void displayMST(int[] parent, int[][] graph) {
        System.out.println("Edges " + " Weights");
        for (int i = 1; i < v; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }

    }

    void primMST(int[][] graph) {
        int[] parent = new int[v];
        int[] key = new int[v];
        boolean[] mstSet = new boolean[v];

        Arrays.fill(key, Integer.MAX_VALUE);

        key[0] = 0;
        parent[0] = -1;

        for (int i = 0; i < v - 1; i++) {
            int min = minkey(key, mstSet);
            mstSet[min] = true;

            for (int j = 0; j < v; j++) {
                if (graph[min][j] != 0 && !mstSet[j] && graph[min][j] < key[j]) {
                    parent[j] = min;
                    key[j] = graph[min][j];
                }
            }
        }

        displayMST(parent, graph);

    }

    public static void main(String[] args) {

        CA2 prim = new CA2();
        int[][] graph = {
            { 0, 2, 0, 6, 0 },
            { 2, 0, 3, 8, 5 },
            { 0, 3, 0, 0, 7 },
            { 6, 8, 0, 0, 9 },
            { 0, 5, 7, 9, 0 }
        };

        prim.primMST(graph);

    }

}
