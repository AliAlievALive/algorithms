package tr.learn;

import static java.lang.Math.log;
import static java.lang.Math.min;

public class Lesson94_SparseTable {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 5, 6, 7, 8};
        int[][] st = new int[a.length][(int) (log(a.length) + 1)];

        for (int i = 0; i < a.length; i++) {
            st[i][0] = a[i];
        }

        for (int j = 1; j < st[0].length; j++) {
            for (int i = 0; i + (1 << (j - 1)) < a.length; i++) {
                st[i][j] = min(st[i][j - 1], st[i + (1 << (j - 1))][j - 1]);

            }
        }

        int l = 1;
        int r = 5;
        int j = (int) log(r - l + 1);
        System.out.println(min(st[l][j], st[r - (1 << j) + 1][j]));
    }
}
