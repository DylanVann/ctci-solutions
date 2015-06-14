package CH7.Q1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dylanvann on 15-06-06.
 */
public class CardTest {

    @Test
    public void testGetValue() throws Exception {
        Card myCard = new Card(9, Card.Suit.CLUBS);
        assertEquals(9, myCard.getValue());
    }

}