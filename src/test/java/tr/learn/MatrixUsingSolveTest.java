package tr.learn;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrixUsingSolveTest {

    @org.junit.jupiter.api.Test
    void matrixSolve() {
        final int mod = 10000;
        long[][] fibMatrix = {
                {1, 1},
                {1, 0}
        };
        long[][] fibFirst = {
                {1, 0}
        };
        long f1 = 1;
        long f0 = 0;
        assertTrue(isFib(fibMatrix, fibFirst, f1, f0, mod));
    }

    private boolean isFib(long[][] fibMatrix, long[][] fibFirst, long f1, long f0, int mod) {
        for (int i = 0; i < 10000; i++) {
            fibFirst = Lesson22_MatrixUsingSolve.matrix_mul(fibFirst, fibMatrix, mod);

            long f2 = (f1 + f0) % mod;
            f0 = f1;
            f1 = f2;

            if (f1 != fibFirst[0][0]) {
                return false;
            }
        }
        return true;
    }
}