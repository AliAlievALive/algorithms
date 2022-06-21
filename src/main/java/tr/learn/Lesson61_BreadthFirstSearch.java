package tr.learn;

import java.util.*;

public class Lesson61_BreadthFirstSearch {
    static void bfsList(int[][] graph) {
        int startVertex = 0;
        List<Integer> used = new ArrayList<>(graph.length);
        used.add(startVertex, 1);
        for (int i = 1; i < graph.length; i++) {
            used.add(0);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(startVertex);

        while (!q.isEmpty()) {
            int currentVertex = q.peek();
            System.out.print(currentVertex + 1 + " ");
            q.remove();
            for (int i = 0; i < graph[currentVertex].length; i++) {
                int adjacentVertex = graph[currentVertex][i];
                if (used.get(adjacentVertex) != 1) {
                    q.add(adjacentVertex);
                    used.set(adjacentVertex, 1);
                }
            }
        }
    }

    static void bfsMatrix(int[][] graph) {
        int startVertex = 0;
        List<Integer> used = new ArrayList<>(graph.length);
        used.add(startVertex, 1);
        for (int i = 1; i < graph.length; i++) {
            used.add(0);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(startVertex);

        while (!q.isEmpty()) {
            int currentVertex = q.peek();
            System.out.print(currentVertex + 1 + " ");
            q.remove();
            for (int i = 0; i < graph[currentVertex].length; i++) {
                if (graph[currentVertex][i] == 1) {
                    if (used.get(i) != 1) {
                        q.add(i);
                        used.set(i, 1);
                    }
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
        bfsList(adjacencyList);

        System.out.println();

        bfsMatrix(adjacencyMatrix);
    }
}
