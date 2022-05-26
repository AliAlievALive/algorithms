package tr.learn;

import java.util.ArrayList;

public class Lesson12_QuickSort {

    static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    static void quick_sort(ArrayList<Integer> arr) {
        quick_sort(arr, 0, arr.size() - 1);
    }

    static void quick_sort(ArrayList<Integer> arr, int i, int j) {
        if (i < j) {
            int pivot = partition(arr, i, j); // [i, pivot - 1] < pivot, [pivot + 1, j] >= pivot
            quick_sort(arr, i, pivot - 1);
            quick_sort(arr, pivot + 1, j);
        }
    }

    private static int partition(ArrayList<Integer> arr, int i, int j) {
        int pivot = arr.get(j);
        int s1_index = (i - 1);
        for (int k = i; k <= j - 1; k++) {
            if (arr.get(k) < pivot) {
                s1_index++;
                swap(arr, s1_index, k);
            }
            //   27 12 38 39 27 16
            //   27 | 12 16 | 39 27 38
            // | 12 16 | 27 | 39 27 38 |
        }
        swap(arr, s1_index + 1, j);
        return (s1_index + 1);
    }

}
