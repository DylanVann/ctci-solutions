package CH5_BitManipulation;

public class Q3_GetNextIntWithSameNumberOfBitsSet {

    public static boolean getBit(int n, int index) {
        return ((n & (1 << index)) > 0);
    }

    public static int setBit(int n, int index, boolean b) {
        if (b) return n | (1 << index);
        else return n & ~(1 << index);
    }

    public static int getNextIntWithSameNumberOfBitsSet(int n) {
        if (n <= 0) return -1;

        int index = 0;
        int countOnes = 0;

        // Find the first one.
        while(!getBit(n, index)) {
            index++;
        }

        // Turn on the next zero.
        while(getBit(n, index)) {
            index++;
            countOnes++;
        }

        n = setBit(n, index, true);
        index--;
        n = setBit(n, index, false);
        countOnes--;

        // Move 1's over to the right.

        // Set zeros.
        for (int i = index - 1; i >= countOnes ; i--) {
            n = setBit(n, i, false);
        }

        // Set ones.
        for (int i = countOnes ; i >= 0 ; i --) {
            n = setBit(n, i, true);
        }

        return n;
    }
}
