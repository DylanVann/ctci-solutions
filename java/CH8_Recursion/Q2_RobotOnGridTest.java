package CH8_Recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_RobotOnGridTest {

    @Test
    public void testNumberOfPossiblePaths() throws Exception {
        assertEquals(70, Q2_RobotOnGrid.numberOfPossiblePaths(5, 5));
    }

}
