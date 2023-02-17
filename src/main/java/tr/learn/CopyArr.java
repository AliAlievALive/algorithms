package tr.learn;

import java.util.ArrayList;
import java.util.List;

public class CopyArr {
    private int n = 100;
    private int m = 200;

    public List<Integer> copy(int[] arr1, int[] arr2) {
        List<Integer> arr = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int k = n;
        if (n < m) {
            for (int i = 0; i < n; i++, k++) {
                if (arr1[i] % 2 == 0) {
                    arr.add(arr1[i]);
                }
                if (arr2[i] % 2 != 0) {
                    arr.add(arr2[i]);
                }
            }
        }
        return arr;
    }
}
