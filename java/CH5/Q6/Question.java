package CH5.Q6;

public class Question {

    public static int swapBitsOddEven(int n) {
        return (((n & 0xaaaaaaaa) >> 1) | ((n & 0x55555555) << 1));
    }

}
