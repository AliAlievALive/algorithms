package tr.learn;

import java.util.List;

public class Lesson12_QuickSort {

    static List<Integer> quick_sort(List<Integer> arr) {
        quick_sort(arr, 0, arr.size());
        return null;
    }

    static List<Integer> quick_sort(List<Integer> arr, int i, int j) {
        if (i == j) {
            return arr;
        }
        int pivot = partition(arr, i, j); // [i, pivot - 1] < pivot, [pivot + 1, j] >= pivot
        i = pivot;
        List<Integer> part1 = quick_sort(arr, i, pivot);
        List<Integer> part2 = quick_sort(arr, pivot + 1, j);
        part1.addAll(part2);
        arr = part1;
        return arr;
    }

    private static int partition(List<Integer> arr, int i, int j) {
        int pivot = i;
        int s1_index = i;
        int s2_index = i;
        for (int k = i + 1; k < j; ++k) {
            if (arr.get(k) >= arr.get(pivot)) {
                ++s2_index;
            } else {
                ++s1_index;
                int m = arr.get(s1_index);
                arr.set(s1_index, arr.get(k));
                arr.set(k, m);
                ++s2_index;
            }
            //   27 12 38 39 27 16
            //   27 | 12 16 | 39 27 38
            // | 12 16 | 27 | 39 27 38 |
        }
        int m = arr.get(s1_index);
        arr.set(pivot, arr.get(s1_index));
        arr.set(s1_index, m);
        return s1_index;
    }

}
