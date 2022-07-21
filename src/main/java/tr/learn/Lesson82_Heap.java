package tr.learn;

public class Lesson82_Heap {
    static int[] heap = {1};
    public static int[] main() {
        heap = add(heap, 2);
        heap = add(heap, 5);
        heap = add(heap, 3);
        heap = add(heap, 10);
        heap = add(heap, 6);
        heap = add(heap, 9);
        heap = add(heap, 5);
        heap = add(heap, 12);
        heap = add(heap, 40);

        return heap;
    }

    static int[] add(int[] heap, int node) { // O(log(n))
        int[] resHeap = new int[heap.length + 1];
        System.arraycopy(heap, 0, resHeap, 0, heap.length);
        resHeap[heap.length] = node;
        int ind = resHeap.length - 1;
        while (ind != 1 && resHeap[ind] < resHeap[ind / 2]) {
            swap(resHeap, ind, ind >> 1);
            ind >>= 1;
        }
        return resHeap;
    }

    static void erase(int[] heap) { // O(log(n))
        swap(heap, 1, heap.length - 1);
        int[] resHeap = new int[heap.length - 1];
        System.arraycopy(heap, 0, resHeap, 0, heap.length - 1);
        int ind = 1;
        while ((ind << 1) < resHeap.length && resHeap[ind] > resHeap[ind << 1] ||
                (ind << 1 | 1) < resHeap.length && resHeap[ind] > resHeap[ind << 1 | 1]) {
            if ((ind << 1) + 1 >= resHeap.length || resHeap[ind << 1] < resHeap[ind << 1 | 1]) {
                swap(resHeap, ind, ind << 1);
            } else {
                swap(resHeap, ind, ind << 1 | 1);
                ++ind;
            }
            ind <<= 1;
        }
    }

    static boolean empty(int[] heap) {
        return heap.length == 1;
    }

    private static int top(int[] heap) {
        return heap[1];
    }

    private static void swap(int[] resHeap, int ind1, int ind2) {
        int t = resHeap[ind1];
        resHeap[ind1] = resHeap[ind2];
        resHeap[ind2] = t;
    }

}
