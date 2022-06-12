package tr.learn;

public class Lesson18_MatrixMul {
    static int[][] matrix_mul(int[][] a, int[][] b) {
        int n = a.length;
        int m = a[0].length;
        int k = b[0].length;
        int[][] c = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return c;
    }
}
