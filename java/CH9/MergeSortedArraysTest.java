package CH9;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArraysTest {

    public void simpleTest() {
        int[] a = {1,2,3,4,0,0,0,0};
        int[] b = {5,6,7,8};
        int[] expectedResult = {1,2,3,4,5,6,7,8};
        MergeSortedArrays.mergeSortedArrays(a, 4, b, 4);
        assertArrayEquals(expectedResult, a);
    }

    public void complexTest() {
        int[] a = {1,2,3,4,0,0,0,0};
        int[] b = {0,2,5,9};
        int[] expectedResult = {0,1,2,2,3,4,5,9};
        MergeSortedArrays.mergeSortedArrays(a, 4, b, 4);
        assertArrayEquals(expectedResult, a);
    }

    @Test
    public void testMergeSortedArrays() throws Exception {
        simpleTest();
        complexTest();
    }

}