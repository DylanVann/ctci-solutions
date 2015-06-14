package CH5.Q1;

public class Question {

    /**
     * Take two integers a and b.
     * Write the bits from b into a in between indices from and to.
     *
     * ex.
     * a = 111111
     * b = 000000
     * indices:
     * from = 2
     * to = 4
     * result = 001110
     *
     * @param a First int.
     * @param b Second int.
     * @param from Start index.
     * @param to End index.
     * @return Combined int.
     */
    int writeBits(int a, int b, int from, int to) {
        int max = ~0;

        // Create a mask int with 0's between from and to.
        // ex. 1111111111000111

        // Note:
        // (1 << 4) = 1000
        // ((1 << 4) - 1) = 111

        // 1's before to.
        int left = max - ((1 << to) -1);
        // 1's after from.
        int right = ((1 << from) - 1);

        // Create the mask.
        int mask = left | right;

        return (a & mask) | (b << from);
    }

}
