package tr.learn;

public class Lesson90_FenwickTree {
    static int[] tree;
    static int n = 8;

    public static void main(String[] args) {
        int l = 1;
        int r = 6;
        int[] a = {l, 2, 3, 4, 5, r, 7, 8};
        tree = new int[n];
        buildTree(a);
        System.out.println(sum(l, r));
        update(3, 10);
        System.out.println(sum(l, r));
    }

    private static void update(int i, int x) {
        for (int j = i; j < n; j = j | (j + 1)) {
            tree[j] += x;
        }
    }

    private static void buildTree(int[] a) {
        for (int i = 0; i < a.length; i++) {
            update(i, a[i]);
        }
    }

    private static int sum(int r) {
        int result = 0;
        for (; r >= 0; r = (r & (r + 1)) - 1) {
            result += tree[r];
        }
        return result;
    }

    private static int sum(int l, int r) {
        return sum(r) - sum(l - 1);
    }
}
