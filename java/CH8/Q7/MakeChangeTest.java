package CH8.Q7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dylanvann on 15-06-12.
 */
public class MakeChangeTest {

    @Test
    public void testMakeChange() throws Exception {
        assertEquals(242, MakeChange.makeChange(100,new int[]{25,10,5,1}));
    }

}