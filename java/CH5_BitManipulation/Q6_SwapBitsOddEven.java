package CH5_BitManipulation;

public class Q6_SwapBitsOddEven {

    public static int swapBitsOddEven(int n) {
        return (((n & 0xaaaaaaaa) >> 1) | ((n & 0x55555555) << 1));
    }

}
