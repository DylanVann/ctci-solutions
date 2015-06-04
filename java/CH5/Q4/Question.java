package CH5.Q4;

public class Question {

    public static boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }

}
