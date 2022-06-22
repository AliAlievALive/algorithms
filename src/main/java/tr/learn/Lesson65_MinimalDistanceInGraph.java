package tr.learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lesson65_MinimalDistanceInGraph {

    static void bfsList(int[][] graph, int startVertex) {
        List<Integer> used = new ArrayList<>(graph.length);
        for (int i = 0; i < graph.length; i++) {
            used.add(0);
        }
        used.set(startVertex, 1);
        Queue<Integer> q = new LinkedList<>();
        q.add(startVertex);
        List<Integer> distance = new ArrayList<>(graph.length);
        for (int i = 0; i < graph.length; i++) {
            distance.add(0);
        }

        while (!q.isEmpty()) {
            int currentVertex = q.peek();
            q.remove();
            System.out.print(currentVertex + 1 + " ");
            for (int i = 0; i < graph[currentVertex].length; i++) {
                int adjacentVertex = graph[currentVertex][i];
                if (used.get(adjacentVertex) != 1) {
                    q.add(adjacentVertex);
                    distance.set(adjacentVertex, distance.get(currentVertex) + 1);
                    used.set(adjacentVertex, 1);
                }
            }
        }
        for (int i = 0; i < distance.size(); i++) {
            System.out.println(i + 1 + " " + distance.get(i));
            
        }
    }

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {1, 2},
                {0, 3, 6},
                {0, 3},
                {1, 2, 4, 5, 6},
                {3, 7},
                {3, 7},
                {1, 3, 7},
                {4, 5, 6, 8},
                {7}
        };

        bfsList(graph, 0);
    }
}
