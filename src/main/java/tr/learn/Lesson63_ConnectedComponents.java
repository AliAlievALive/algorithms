package tr.learn;

import java.util.ArrayList;
import java.util.List;

public class Lesson63_ConnectedComponents {

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {4, 5},
                {3},
                {3},
                {1, 2, 9},
                {0},
                {0},
                {},
                {8},
                {7},
                {3}
        };

        List<Integer> used = new ArrayList<>(graph.length);
        for (int i = 0; i < graph.length; i++) {
            used.add(0);
        }
        for (int i = 0; i < graph.length; i++) {
            if (used.get(i) != 1) {
                Lesson59_DepthFirstSearch.dfsList(graph, used, i);
                System.out.println();
            }
        }
    }
}
