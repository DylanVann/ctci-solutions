package CH5.Q7;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuestionTest {

    @Test
    public void testFindMissingInt() throws Exception {
        int [] ints  = {0,1,2,3,4,5,6,8,9};
        ArrayList<Integer> intsList = new ArrayList<Integer>();
        for (int i : ints) intsList.add(i);

        assertEquals(7, Question.findMissingInt(intsList));
    }

    @Test
    public void testGetBit() throws Exception {
        int test = 10; //1010
        assertEquals(false, Question.getBit(test, 0));
        assertEquals(true, Question.getBit(test, 1));
        assertEquals(false, Question.getBit(test, 2));
        assertEquals(true, Question.getBit(test, 3));
    }

}