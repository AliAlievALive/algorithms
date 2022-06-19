package tr.learn;

import java.util.ArrayList;
import java.util.List;

public class Lesson59_DepthFirstSearch {
    static void dfsList(int[][] graph, List<Integer> used, int currentVertex) {
        System.out.print(currentVertex + 1 + " ");
        used.set(currentVertex, 1);
        for (int i = 0; i < graph[currentVertex].length; i++) {
            int adjacentVertex = graph[currentVertex][i];
            if (used.get(adjacentVertex) != 1) {
                dfsList(graph, used, adjacentVertex);
            }
        }
    }

    static void dfsMatrix(int[][] graph, List<Integer> used, int currentVertex) {
        System.out.print(currentVertex + 1 + " ");
        used.set(currentVertex, 1);
        for (int i = 0; i < graph[currentVertex].length; i++) {
            if (graph[currentVertex][i] == 1) {
                if (used.get(i) != 1) {
                    dfsMatrix(graph, used, i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] adjacencyList = new int[][]{
                {1, 3},
                {0, 5, 6},
                {6},
                {0, 4},
                {3, 7},
                {1, 6},
                {1, 2, 5},
                {4}
        };

        int[][] adjacencyMatrix = new int[][]{
                {0, 1, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 1, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0}
        };
        final int n = 8;
        List<Integer> used = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            used.add(0);
        }
        dfsList(adjacencyList, used, 0);

        System.out.println();

        for (int i = 0; i < n; i++) {
            used.set(i, 0);
        }
        dfsMatrix(adjacencyMatrix, used, 0);
    }
}
