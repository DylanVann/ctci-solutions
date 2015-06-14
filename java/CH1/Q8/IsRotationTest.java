package CH1.Q8;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsRotationTest {

    interface IsRotation {
        boolean isRotation(String a, String b);
    }

    public void testIsRotation(IsRotation isRotation) {
        assertEquals(true, isRotation.isRotation("waterbottle", "erbottlewat"));
        assertEquals(false, isRotation.isRotation("waterbooooo", "erbbottlewat"));
    }

    @Test
    public void testIsRotation() {
        testIsRotation(CH1.Q8.IsRotation::isRotation);
    }

    @Test
    public void testIsRotation_Contains() {
        testIsRotation(CH1.Q8.IsRotation::isRotation_Contains);
    }

}