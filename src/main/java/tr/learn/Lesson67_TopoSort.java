package tr.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson67_TopoSort {

    static List<Integer> dfs(int[][] graph, List<Integer> used, List<Integer> order, int currentVertex) {
        used.set(currentVertex, 1);

        for (int i = 0; i < graph[currentVertex].length; i++) {
            int adjacentVertex = graph[currentVertex][i];
            if (used.get(adjacentVertex) != 1) {
                order = dfs(graph, used, order, adjacentVertex);
            }
        }
        order.add(currentVertex);
        return order;
    }

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {4},
                {0},
                {3, 1},
                {0, 1, 4},
                {}
        };
        int startVertex = 0;
        List<Integer> used = new ArrayList<>(graph.length);
        for (int i = 0; i < graph.length; i++) {
            used.add(0);
        }
        List<Integer> order = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (used.get(i) != 1) {
                order = dfs(graph, used, order, startVertex);
            }
        }
        Collections.reverse(order);
        for (int i = 0; i < graph.length; i++) {
            System.out.println((i + 1) + " -> " + (order.get(i) + 1));
        }
    }
}
