package tr.learn;

import java.util.ArrayList;
import java.util.List;

public class Lesson11_MergeSort {
    private List<Integer> arr;

    public List<Integer> getArr() {
        return arr;
    }

    public Lesson11_MergeSort(List<Integer> arr) {
        System.out.println(arr);
        System.out.println(arr.size());
        merge_sort(arr);
    }

    void merge_sort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return;
        }
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int n = arr.size() / 2;
        for (int i = 0; i < n; ++i) {
            left.add(arr.get(i));
        }
        for (int i = n; i < arr.size(); ++i) {
            right.add(arr.get(i));
        }
        merge_sort(left);
        merge_sort(right);

        arr = merge(left, right);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int left_index = 0, right_index = 0;
        while (left_index < left.size() && right_index < right.size()) {
            if (left.get(left_index) <= right.get(right_index)) {
                merged.add(left.get(left_index++));
            } else {
                merged.add(right.get(right_index++));
            }
        }
        while (left_index < left.size()) {
            merged.add(left.get(left_index++));
        }
        while (right_index < right.size()) {
            merged.add(right.get(right_index++));
        }
        return merged;
    }
}
