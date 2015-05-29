package CH1.Q8;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {

    interface IsRotation {
        boolean isRotation(String a, String b);
    }

    public void testIsRotation(IsRotation isRotation) {
        assertEquals(true, isRotation.isRotation("waterbottle", "erbottlewat"));
        assertEquals(false, isRotation.isRotation("waterbooooo", "erbbottlewat"));
    }

    @Test
    public void testIsRotation() {
        testIsRotation(Question::isRotation);
    }

    @Test
    public void testIsRotation_Contains() {
        testIsRotation(Question::isRotation_Contains);
    }

}