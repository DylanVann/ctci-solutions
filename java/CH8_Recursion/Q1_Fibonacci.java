package CH8_Recursion;

public class Q1_Fibonacci {

    /**
     * Computes fibonacci numbers.
     *
     * Time: O(2^n)
     * Space: O(1)
     *
     * @param n Fibonacci number to calculate.
     * @return The number.
     */
    public static int fib(int n) {
        if (n<=1) return n;
        else return fib(n-1) + fib(n-2);
    }

    /**
     * Computes fibonacci numbers.
     *
     * Time: O(log(n))
     * Space: O(1)
     *
     * @param n Fibonacci number to calculate.
     * @return The number.
     */
    public static int fib_Matrix(int n) {
        return fibIter(1, 0, 0, 1, n);
    }

    static int fibIter(int a, int b, int p, int q, int n) {
        if (n == 0) return b;
        if (n%2 == 0) return fibIter(a, b, p*q + q*q, 2*p*q + q*q, n/2);
        else return fibIter(b*q + a*q + a*p, b*p + a*q, p, q, n - 1);
    }

}
