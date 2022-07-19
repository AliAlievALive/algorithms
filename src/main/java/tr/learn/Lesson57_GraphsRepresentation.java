package tr.learn;

import java.util.*;

public class Lesson57_GraphsRepresentation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a n: ");
        final int n = in.nextInt();
        System.out.print("Input a m: ");
        final int m = in.nextInt();
        List<Pair> edges = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            System.out.print("Input a a: ");
            int a = in.nextInt();
            System.out.print("Input a b: ");
            int b = in.nextInt();
            edges.add(i, new Pair(a, b));
        }

        for (Pair edge : edges) {
            System.out.println(edge.first + " " + edge.second);
        }

//        Adjacency matrix
        int[][] matrix = new int[n][n];
        for (int i = 0; i < m; i++) {
            System.out.print("Input a a: ");
            int a = in.nextInt();
            System.out.print("Input a b: ");
            int b = in.nextInt();
            --a;
            --b;
            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }

//        Adjacency list
        Map<Integer, List<Integer>> matrixMap = new HashMap<>(n);
        for (int i = 0; i < m; i++) {
            System.out.print("Input a a: ");
            int a = in.nextInt();
            System.out.print("Input a b: ");
            int b = in.nextInt();
            --a;
            --b;
            if (matrixMap.get(a) == null) {
                ArrayList<Integer> notes = new ArrayList<>();
                matrixMap.put(a, notes);
            }
            if (matrixMap.get(b) == null) {
                ArrayList<Integer> values = new ArrayList<>();
                matrixMap.put(b, values);
            }
            matrixMap.get(a).add(b);
            matrixMap.get(b).add(a);
        }

        for (Integer integer : matrixMap.keySet()) {
            System.out.print((integer + 1) + ": " + matrixMap.get(integer));
            System.out.println();
        }
        in.close();
    }

    private static class Pair {
        int first;
        int second;

        public Pair(int a, int b) {
            first = a;
            second = b;
        }
    }
}
