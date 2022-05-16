package tr.learn;

public class Lesson5_BitOperations {
    public static void main(String[] args) {
        System.out.println(51 & 25); // 17
        System.out.println(51 | 25); // 59
        System.out.println(51 ^ 25); // 42
        System.out.println(~23); // -24

        System.out.println(12 << 2);
        System.out.println(12 >> 2);
        System.out.println(1 << 4);
        System.out.println(1 << 5);
        System.out.println(1 << 6);
        System.out.println(1 << 7);

        int n = 17; // 0...00010001
        int i = 2;
        n = n | (1 << i);
        System.out.println(n); // 17
        n = n & ~(1 << i);
        System.out.println(n); // 21
        n = n ^ (1 << i);
        System.out.println(n); // 17

        if ((n & (1 << i)) == 0) { // is 0 or 1
            System.out.println();
        }
    }
}
