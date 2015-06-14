package CH5_BitManipulation;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q7_FindMissingIntTest {

    @Test
    public void testFindMissingInt() throws Exception {
        int [] ints  = {0,1,2,3,4,5,6,8,9};
        ArrayList<Integer> intsList = new ArrayList<Integer>();
        for (int i : ints) intsList.add(i);

        assertEquals(7, Q7_FindMissingInt.findMissingInt(intsList));
    }

    @Test
    public void testGetBit() throws Exception {
        int test = 10; //1010
        assertEquals(false, Q7_FindMissingInt.getBit(test, 0));
        assertEquals(true, Q7_FindMissingInt.getBit(test, 1));
        assertEquals(false, Q7_FindMissingInt.getBit(test, 2));
        assertEquals(true, Q7_FindMissingInt.getBit(test, 3));
    }

}
