package CH3_StacksAndQues;

import org.junit.Test;

public class Q4_HanoiTest {

    @Test
    public void testMoveDiscs() throws Exception {
        Q4_Hanoi hanoi = new Q4_Hanoi(4);
        hanoi.moveDiscs();
    }

}
