package CH5.Q1;

public class Question {

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
