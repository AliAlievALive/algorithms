package tr.learn;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Lesson88_SegmentTree {
        static int[] tree;
    public static void main(String[] args) {
        int n = 8;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        tree = new int[4 * a.length];
        buildTree(a, 1, 0, n - 1);
        System.out.println(minQuery(1, 6, 1, 0, n - 1));
        update(3, 10, 1, 0, n - 1);
        System.out.println(minQuery(1, 6, 1, 0, n - 1));
        update(1, 20, 1, 0, n - 1);
        System.out.println(minQuery(1, 6, 1, 0, n - 1));
    }

    private static void buildTree(int[] a, int v, int l, int r) {
        if (l == r) {
            tree[v] = a[l];
            return;
        }
        int m = (l + r) / 2;
        buildTree(a, v * 2, l, m);
        buildTree(a, v * 2 + 1, m + 1, r);
        tree[v] = min(tree[2 * v], tree[2 * v + 1]);
    }

    private static int minQuery(int i, int j, int v, int l, int r) {
        if (i > j) {
            return 1_000_000;
        }
        if (i == l && j == r) {
            return tree[v];
        }
        int m = (l + r) / 2;
//        if (m >= j) {
//            return sum(i, j, v * 2, l, m);
//        } else if (m < i) {
//            return sum(i, j, v * 2 + 1, m + 1, r);
//        } else {
//            return sum(i, m, v * 2, l, m) + sum(m + 1, j, v * 2 + 1, m + 1, r);
//        }
        return min(minQuery(i, min(m, j), v * 2, l, m), minQuery(max(m + 1, i), j, v * 2 + 1, m + 1, r));
    }

    private static void update(int i, int x,  int v, int l, int r) {
        if (l == r) {
            tree[v] = x;
            return;
        }
        int m = (l + r) / 2;
        if (i <= m) {
            update(i, x, v * 2, l, m);
        } else {
            update(i, x, v * 2 + 1, m + 1, r);
        }
        tree[v] = min(tree[2 * v], tree[2 * v + 1]);
    }
}
