package CH7_ObjectOrientedBullshit;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_CardTest {

    @Test
    public void testGetValue() throws Exception {
        Q1_Card myCard = new Q1_Card(9, Q1_Card.Suit.CLUBS);
        assertEquals(9, myCard.getValue());
    }

}
