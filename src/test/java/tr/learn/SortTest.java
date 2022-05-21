package tr.learn;

import java.util.Arrays;
import java.util.Random;

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
}