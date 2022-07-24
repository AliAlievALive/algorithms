package tr.learn;

import static java.lang.Math.sqrt;

public class Lesson92_SqrtDecomposition {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

        int s = (int) sqrt(a.length);
        s++;
        int[] b = new int[s];
        for (int i = 0; i < a.length; i++) {
            b[i / s] += a[i];
        }
        int l = 1, r = 6;
        int sum = 0;
        for (int i = l; i <= r; ) {
            if (i % s == 0 && i + s - 1 <= r) {
                sum += b[i / s];
                i += s;
            } else {
                sum += a[i];
                i++;
            }
        }
        System.out.println(sum);
    }
}
