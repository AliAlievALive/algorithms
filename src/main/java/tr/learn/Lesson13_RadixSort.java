package tr.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson13_RadixSort {

    static int getMax(ArrayList<Integer> arr) {
        int mx = arr.get(0);
        for (Integer elem : arr) {
            mx = elem > mx ? elem : mx;
        }
        return mx;
    }

    static void count_sort(ArrayList<Integer> arr, int exp) {
        ArrayList<Integer> output = new ArrayList<>(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            output.add(0);
        }
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < arr.size(); i++) {
            count[(arr.get(i) / exp) % 10]++;
        }

        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (i = arr.size() - 1; i >= 0; i--) {
            output.set(count[(arr.get(i) / exp) % 10] - 1, arr.get(i));
            count[(arr.get(i) / exp) % 10]--;
        }

        for (i = 0; i < arr.size(); i++) {
            arr.set(i, output.get(i));
        }
    }

    static void radix_sort(ArrayList<Integer> arr)
    {
        int m = getMax(arr);

        for (int exp = 1; m / exp > 0; exp *= 10)
            count_sort(arr, exp);
    }
}
