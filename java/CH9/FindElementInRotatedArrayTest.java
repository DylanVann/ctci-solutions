package CH9;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindElementInRotatedArrayTest {

    @Test
    public void testFindElementInRotatedArray() throws Exception {
        int[] input = {15,16,19,20,25,1,3,4,5,7,10,14};
        for (int i = 0 ; i < input.length ; i++) {
            assertEquals(i, FindElementInRotatedArray.findElementInRotatedArray(input[i], input));
        }
    }

}