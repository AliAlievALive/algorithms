package tr.learn;

import java.util.List;

public class Lesson15_BinarySearch {
    static boolean bin_search(List<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                return true;
            }
            if (arr.get(m) < x) {
                l = m + 1;
            } else if (arr.get(m) > x) {
                r = m - 1;
            }
        }
        return false;
    }
}
