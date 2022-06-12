package tr.learn;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrixMulTest {

    @org.junit.jupiter.api.Test
    void matrix_mul() {
        int[][] a = {
                {1, 2, 3},
                {3, 1, 2}
        };
        int[][] b = {
                {1, 2},
                {3, 2},
                {1, 2}
        };
        int[][] c = {
                {10, 12},
                {8, 12}
        };
        assertTrue(matrixIsEquals(c, Lesson18_MatrixMul.matrix_mul(a, b)));
    }

    private boolean matrixIsEquals(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (b[i][j] != a[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}