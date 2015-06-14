package CH8_Recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q7_MakeChangeTest {

    @Test
    public void testMakeChange() throws Exception {
        assertEquals(242, Q7_MakeChange.makeChange(100, new int[]{25, 10, 5, 1}));
    }

}
