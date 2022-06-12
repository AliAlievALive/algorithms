package tr.learn;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTest {

    @org.junit.jupiter.api.Test
    void bin_search() {
        List<Integer> arr = List.of(1, 2, 4, 5, 7, 9, 12, 15, 19, 23);
        assertTrue(Lesson15_BinarySearch.bin_search(arr, 7));
        assertTrue(Lesson15_BinarySearch.bin_search(arr, 12));
        assertTrue(Lesson15_BinarySearch.bin_search(arr, 23));
        assertFalse(Lesson15_BinarySearch.bin_search(arr, 8));
        assertFalse(Lesson15_BinarySearch.bin_search(arr, 3));
        assertFalse(Lesson15_BinarySearch.bin_search(arr, -1));
    }
}
