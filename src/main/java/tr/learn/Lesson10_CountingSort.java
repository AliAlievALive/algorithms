package tr.learn;

import java.util.Arrays;

public class Lesson10_CountingSort {
    static void counting_sort(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        int[] bucket = new int[max - min + 1];
        for (int k : arr) {
            bucket[k - min]++;
        }
        Arrays.fill(arr, 0);
        int k = 0;
        for (int i = 0; i < bucket.length; i++) {
            int count = bucket[i]; // i + min
            for (int j = 0; j < count; j++) {
                arr[k++] = i + min;
            }
        }
    }
}
