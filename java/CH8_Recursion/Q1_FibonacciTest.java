package CH8_Recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_FibonacciTest {

    @Test
    public void testFib() throws Exception {
        int[] fibSequence = {0,1,1,2,3,5,8,13};
        for (int i = 0 ; i < fibSequence.length ; i++) {
            System.out.println(fibSequence[i]);
            assertEquals(fibSequence[i], Q1_Fibonacci.fib(i));
        }
    }

    @Test
    public void testFib_Matrix() throws Exception {
        int[] fibSequence = {0,1,1,2,3,5,8,13};
        for (int i = 0 ; i < fibSequence.length ; i++) {
            System.out.println(fibSequence[i]);
            assertEquals(fibSequence[i], Q1_Fibonacci.fib_Matrix(i));
        }
    }

}
