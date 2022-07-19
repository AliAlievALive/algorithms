package tr.learn;

import Utils.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson71_DijkstraShortest {

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
        Pair[][] graph = new Pair[][]{
                {new Pair(1, 10), new Pair(5, 5)},
                {new Pair(0, 10), new Pair(2, 1)},
                {new Pair(1, 1), new Pair(3, 5), new Pair(5, 7), new Pair(6, 10)},
                {new Pair(2, 5), new Pair(4, 1)},
                {new Pair(3, 1), new Pair(6, 2)},
                {new Pair(0, 5), new Pair(2, 7), new Pair(6, 100), new Pair(7, 3)},
                {new Pair(2, 10), new Pair(4, 2), new Pair(5, 100), new Pair(7, 8), new Pair(8, 100)},
                {new Pair(5, 3), new Pair(6, 8), new Pair(9, 1)},
                {new Pair(6, 100), new Pair(9, 1)},
                {new Pair(7, 1), new Pair(8, 1)},
        };
        List<Integer> dist = dijkstra(graph);
        for (int j : dist) {
            System.out.print(j + " ");
        }
    }

    static List<Integer> dijkstra(Pair[][] graph) {
        final int INF = 1_000_000;
        List<Integer> dist = new ArrayList<>(graph.length);
        dist.add(0, 0);
        for (int i = 1; i < graph.length; i++) {
            dist.add(INF);
        }
        Set<Pair> set = new HashSet<>();
        set.add(new Pair(0, 0));

        while (!set.isEmpty()) {
            Pair next = set.iterator().next();
            int currentVertex = next.getWeight();
            set.remove(next);
            for (int i = 0; i < graph[currentVertex].length; i++) {
                int advancedVertex = graph[currentVertex][i].getNode();
                int weight = graph[currentVertex][i].getWeight();
                if (dist.get(currentVertex) + weight < dist.get(advancedVertex)) {
                    Pair pair = new Pair(dist.get(advancedVertex), advancedVertex);
                    set.remove(pair);
                    dist.set(advancedVertex, dist.get(currentVertex) + weight);
                    set.add(pair);
                }
            }
        }
        return dist;
    }
}
