package CH5.Q7;

import java.util.ArrayList;

public class Question {

    /**
     * Finds the missing int in an array of ints from 0..n by examining bits.
     *
     * Time: O(n)
     * Space: O(n)
     *
     * @param array
     * @return
     */
    public static int findMissingInt(ArrayList<Integer> array) {
        return findMissingInt(array, 0);
    }

    static int findMissingInt(ArrayList<Integer> array, int column) {
        if (array.size() == 0) return 0;
        if (column >= Integer.SIZE) return 0;

        ArrayList<Integer> zeroBits = new ArrayList<>();
        ArrayList<Integer> oneBits = new ArrayList<>();
        for (int i : array) {
            if (getBit(i, column)) {
                oneBits.add(i);
            }
            else {
                zeroBits.add(i);
            }
        }

        if (zeroBits.size() <= oneBits.size()) {
            // The next bit is a 0.
            System.out.print("0");
            // We can discard the numbers that had this bit set to 1.
            int v = findMissingInt(zeroBits, column+1);
            // Push on a zero.
            return (v << 1);
        }
        else {
            // The next bit is a 1.
            System.out.print("1");
            // We can discard the numbers that had this bit set to 0.
            int v = findMissingInt(oneBits, column+1);
            // Push on a one.
            return (v << 1) | 1;
        }
    }

    public static boolean getBit(int n, int index) {
        return (((n >> index) & 1) > 0);
    }

}
