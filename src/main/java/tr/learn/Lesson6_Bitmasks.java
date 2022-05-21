package tr.learn;

public class Lesson6_Bitmasks {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            System.out.print("{");
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == 0) {
                    System.out.printf(" %d ", arr[i]);
                }
            }
            System.out.println("}");
        }
    }

}
