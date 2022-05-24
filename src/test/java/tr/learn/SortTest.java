package tr.learn;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @org.junit.jupiter.api.Test
    void selection_sort() {
        final int n = new Random().nextInt(0, 100);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt();
        }

        int[] arr_copy = new int[n];
        System.arraycopy(arr, 0, arr_copy, 0, arr.length);
        Arrays.sort(arr_copy);
        Lesson7_SelectionSort.selection_sort(arr);
        assertArrayEquals(arr_copy, arr);
    }

    @org.junit.jupiter.api.Test
    void bubble_sort() {
        final int n = new Random().nextInt(0, 100);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt();
        }

        int[] arr_copy = new int[n];
        System.arraycopy(arr, 0, arr_copy, 0, arr.length);
        Arrays.sort(arr_copy);
        Lesson8_BubbleSort.bubble_sort(arr);
        assertArrayEquals(arr_copy, arr);
    }

    @org.junit.jupiter.api.Test
    void insertion_sort() {
        final int n = new Random().nextInt(0, 100);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt();
        }

        int[] arr_copy = new int[n];
        System.arraycopy(arr, 0, arr_copy, 0, arr.length);
        Arrays.sort(arr_copy);
        Lesson9_InsertionSort.insertion_sort(arr);
        assertArrayEquals(arr_copy, arr);
    }

    @org.junit.jupiter.api.Test
    void counting_sort() {
        final int n = new Random().nextInt(0, 10);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(0, 500_000);
        }

        int[] arr_copy = new int[n];
        System.arraycopy(arr, 0, arr_copy, 0, arr.length);
        Arrays.sort(arr_copy);
        Lesson10_CountingSort.counting_sort(arr);
        assertArrayEquals(arr_copy, arr);
    }

    @org.junit.jupiter.api.Test
    void merge_sort() {
        final int n = new Random().nextInt(0, 100);
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(new Random().nextInt(0, 100));
        }

        List<Integer> arr_copy = new ArrayList<>(n);
        arr_copy.addAll(arr);
        arr_copy.sort(Comparator.comparingInt(o -> o));
        arr = Lesson11_MergeSort.merge_sort(arr);
        assertArrayEquals(new List[]{arr_copy}, new List[]{arr});
    }
    @org.junit.jupiter.api.Test
    void quick_sort() {
        final int n = 6;
        List<Integer> arr = new ArrayList<>(n);
        arr.add(27);
        arr.add(12);
        arr.add(38);
        arr.add(39);
        arr.add(27);
        arr.add(16);
//        for (int i = 0; i < n; i++) {
//            arr.add(new Random().nextInt(0, 100));
//        }

        List<Integer> arr_copy = new ArrayList<>(n);
        arr_copy.addAll(arr);
        arr_copy.sort(Comparator.comparingInt(o -> o));
        arr = Lesson12_QuickSort.quick_sort(arr);
        assertArrayEquals(new List[]{arr_copy}, new List[]{arr});
    }
}