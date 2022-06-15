package tr.learn;

public class Lesson22_MatrixUsingSolve {
    static long[][] matrix_mul(long[][] a, long[][] b, long mod) {
        int n = a.length;
        int m = a[0].length;
        int k = b[0].length;
        long[][] c = new long[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++) {
                    c[i][j] += (a[i][l] * b[l][j]) % mod;
                }
                c[i][j] %= mod;
            }
        }
        return c;
    }

    static long[][] bin_pow(long[][] a, long n, long mod) {
        long[][] res = new long[a.length][a[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i][i] = 1;
        }
        while (n != 0) {
            if ((n & 1) != 0) {
                res = matrix_mul(res, a, mod);
            }
            n >>= 1;
            a = matrix_mul(a, a, mod);
        }
        return res;
    }
}
