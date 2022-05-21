package tr.learn;

public class Lesson8_BubbleSort {
    static void bubble_sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            boolean is_sorted = true;
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i] < arr[i - 1]) {
                    is_sorted = false;
                    int k = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = k;
                }
            }
            if (is_sorted) {
                return;
            }
        }
    }
}
