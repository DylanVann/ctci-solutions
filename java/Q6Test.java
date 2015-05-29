import CtCILibrary.AssortedMethods;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q6Test {

    interface RotateMatrix90 {
        void rotate90(int[][] mat);
    }

    public void testRotateMatrix90(RotateMatrix90 rotateMatrix90) {
        int[][] inputMatrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] outputMatrix = {
                {3,6,9},
                {2,5,8},
                {1,4,7}};
        int[][] expectedOutputMatrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        rotateMatrix90.rotate90(outputMatrix);

        System.out.println("Input:");
        AssortedMethods.printMatrix(inputMatrix);
        System.out.println();
        System.out.println();

        System.out.println("Expected output:");
        AssortedMethods.printMatrix(expectedOutputMatrix);
        System.out.println();
        System.out.println();

        System.out.println("Output:");
        AssortedMethods.printMatrix(outputMatrix);
        System.out.println();
        System.out.println();

        assertArrayEquals(expectedOutputMatrix, outputMatrix);
    }

    @Test
    public void testRotateMatrix90_InPlace() throws Exception {
        testRotateMatrix90(Q6::rotateMatrix90_InPlace);
    }

}