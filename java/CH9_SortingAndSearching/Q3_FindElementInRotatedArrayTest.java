package CH9_SortingAndSearching;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_FindElementInRotatedArrayTest {

    @Test
    public void testFindElementInRotatedArray() throws Exception {
        int[] input = {15,16,19,20,25,1,3,4,5,7,10,14};
        for (int i = 0 ; i < input.length ; i++) {
            assertEquals(i, Q3_FindElementInRotatedArray.findElementInRotatedArray(input[i], input));
        }
    }

}
