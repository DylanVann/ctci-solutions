package CH5_BitManipulation;

public class Q4_IsPowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }

}
