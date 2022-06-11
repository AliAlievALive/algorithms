package tr.learn;

public class Lesson14_BinaryPower {
    static int bin_pow1(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 1) {
            return bin_pow1(a, n - 1) * a;
        }
        int b = bin_pow1(a, n / 2);
        return b * b;
    }

    static int bin_pow2(int a, int n) {
        int result = 1;
        while (n != 0) {
            if ((n & 1) != 0) {
                result *= a;
            }
            n >>= 1;
            a *= a;
//            a, a^2, a^4, a^8, ..
        }
        return result;
    }
}
