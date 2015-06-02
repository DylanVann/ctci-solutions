package CH3.Q4;

import org.junit.Test;

import static org.junit.Assert.*;

public class HanoiTest {

    @Test
    public void testMoveDiscs() throws Exception {
        Hanoi hanoi = new Hanoi(4);
        hanoi.moveDiscs();
    }

}