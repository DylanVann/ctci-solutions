package CH6.Q3;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {

    @Test
    public void testJugWith4Quarts() {
        Jug q5 = new Jug(5);
        Jug q3 = new Jug(3);
        q5 = Question.jugWith4Quarts(q5,q3);
        assertEquals(4, q5.waterQuarts);
    }

}