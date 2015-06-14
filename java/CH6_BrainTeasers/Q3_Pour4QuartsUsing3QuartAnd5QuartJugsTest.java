package CH6_BrainTeasers;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_Pour4QuartsUsing3QuartAnd5QuartJugsTest {

    @Test
    public void testJugWith4Quarts() {
        Q3_Jug q5 = new Q3_Jug(5);
        Q3_Jug q3 = new Q3_Jug(3);
        q5 = Q3_Pour4QuartsUsing3QuartAnd5QuartJugs.jugWith4Quarts(q5, q3);
        assertEquals(4, q5.waterQuarts);
    }

}
