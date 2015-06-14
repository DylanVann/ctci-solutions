package CH8.Q2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotOnGridTest {

    @Test
    public void testNumberOfPossiblePaths() throws Exception {
        assertEquals(70, RobotOnGrid.numberOfPossiblePaths(5,5));
    }

}