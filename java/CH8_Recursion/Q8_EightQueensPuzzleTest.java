package CH8_Recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_EightQueensPuzzleTest {

    @Test
    public void testPrintEightQueensSolutions() throws Exception {
        assertEquals(92, Q8_EightQueensPuzzle.printEightQueensSolutions());
    }

}
