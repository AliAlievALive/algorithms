package tr.learn;

public class Lesson16_GCD {
    static int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
