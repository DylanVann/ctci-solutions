package CH1.Q7;

import CtCILibrary.AssortedMethods;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroRowsAndColumnsContainingZerosTest {

    @Test
    public void testSetZeros() throws Exception {
        int[][] input = {
                {4, 0, 8, 3},
                {1, 2, 1, 7},
                {1, 3, 2, 0},
                {5, 8, 3, 6}
        };
        int[][] expectedOutput = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 0, 0, 0},
                {5, 0, 3, 0}
        };
        int[][] output = {
                {4,0,8,3},
                {1,2,1,7},
                {1,3,2,0},
                {5,8,3,6}
        };

        ZeroRowsAndColumnsContainingZeros.setZeros(output);

        System.out.println("Input:");
        AssortedMethods.printMatrix(input);
        System.out.println();
        System.out.println();

        System.out.println("Expected output:");
        AssortedMethods.printMatrix(expectedOutput);
        System.out.println();
        System.out.println();

        System.out.println("Output:");
        AssortedMethods.printMatrix(output);
        System.out.println();
        System.out.println();

        assertArrayEquals(expectedOutput, output);
    }

}