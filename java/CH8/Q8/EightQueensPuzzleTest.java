package CH8.Q8;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dylanvann on 15-06-12.
 */
public class EightQueensPuzzleTest {

    @Test
    public void testPrintEightQueensSolutions() throws Exception {
        assertEquals(92, EightQueensPuzzle.printEightQueensSolutions());
    }

}