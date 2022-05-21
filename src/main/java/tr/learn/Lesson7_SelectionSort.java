package tr.learn;

public class Lesson7_SelectionSort {
    static void selection_sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {

            int min_ind = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[min_ind] > arr[i]) {
                    min_ind = i;
                }
            }
            int k = arr[j];
            arr[j] = arr[min_ind];
            arr[min_ind] = k;
        }
    }
}
