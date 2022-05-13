package tr.learn;

public class Lesson1_Asymptotic_analysis { // O(n) = c * n
    int search(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    void swap(int a, int b) { // O(1) = c
        int t = a;
        a = b;
        b = t;
        System.out.println(a + b);
    }

    void cycle_l() { // O (1)
        final int c = 4;
        for (int i = 0; i < c; i++) {
            System.out.println(i);
        }
    }

    void cycle_n(int n) { // O (n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    void cycle_nm1(int n, int m) { // O(max(n,m)) = O(n+m)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < m; i++) {
            System.out.println(i);
        }
    }

    void cycle_nm2(int n, int m) { // O(n*m)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(i + j);
            }
        }
    }

    void cycle_n2(int n) { // O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j);
            }
        }
    }

    void cycle_n3(int n) { // O(n^3)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(i + j + k);
                }
            }
        }
    }

    void cycle_ij(int n) { // O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.println(i + j);
            }
        }
        // n + (n - 1) + (n - 2) + (n - 3) + ... + 1 == n * (n + 1) / 2
        // n * (n + 1) / 2 = 1/2 * (n*n + n) = O(n^2)
    }

    void cycle_n123(int n) { // O(n^3)
        for (int i = 0; i < n; i++) {
            System.out.println(i); // O(n)
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j); // O(n^2)
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(i + j + k); // O(n^3)
                }
            }
        }
    }

    void cycle_abc123(int a, int b, int c) { // O(a + b^2 + c^3)
        for (int i = 0; i < a; i++) {
            System.out.println(i); // O(a)
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(i + j); // O(b^2)
            }
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.println(i + j + k); // O(c^3)
                }
            }
        }
    }

    int cycle_log1(int a) { // O(log(a))
        int sum = 0;
        while (a != 0) { // log10(a)
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    int cycle_log2(int n) { // O(n * log(n))
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = i;
            while (a != 0) { // log10(a)
                sum += a % 10;
                a /= 10;
            }
        }

        return sum;
    }

    void cycle_sqrt(int n) { // O(sqrt(n))
        for (int i = 0; i * i < n; i++) {
            System.out.println(i);
        }
    }

    void cycle_n_plus_2(int n) { // O(n)
        for (int i = 0; i * i < n; i += 2) {
            System.out.println(i);
        }
    }
}
