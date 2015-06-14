package CH9;

public class FindElementInRotatedArray {

    public static int findElementInRotatedArray(int element, int[] array) {
        return findElementInRotatedArray(array, 0, array.length - 1, element);
    }

    static int findElementInRotatedArray(int a[], int l, int r, int x) {
        // While left is less than right.
        while (l <= r) {
            // The middle of the part we're searching.
            int m = (l + r) / 2;
            if (x == a[m]) {
                // Found the element.
                return m;
            }
            else if (a[l] <= a[m]) {
                // The array is in increasing order up to the middle.
                if ( x > a[m]) {
                    // Element is on the right.
                    l = m+1;
                }
                else if (x >= a[l]) {
                    // Element is on the left.
                    r = m-1;
                }
                else {
                    // Element is on the right.
                    l = m+1;
                }
            }
            else if (x < a[m]) {
                // Element is on the left.
                r = m-1;
            }
            else if (x <= a[r]) {
                // Element is on the right.
                l = m+1;
            }
            else {
                // Element is on the left.
                r = m-1;
            }
        }
        return -1;
    }

}
