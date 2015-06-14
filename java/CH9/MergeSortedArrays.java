package CH9;

public class MergeSortedArrays {

    public static void mergeSortedArrays(int[] a, int aLength, int[] b, int bLength) {
        int k = aLength + bLength - 1; // Index of last location in b.
        int i = bLength - 1; // Index of last element in b.
        int j = aLength - 1; // Index of last element in a.

        // Read each array from right to left. Largest to smallest.
        // Put the largest element at the end of a.
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                a[k--] = a[i--];
            }
            else {
                a[k--] = b[j--];
            }
        }
        // Put any leftover elements in b into the remaining space.
        while (j >= 0) {
            a[k--] = b[j--];
        }
    }

}
