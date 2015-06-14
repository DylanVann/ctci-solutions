package CH1_ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_IsRotationTest {

    interface IsRotation {
        boolean isRotation(String a, String b);
    }

    public void testIsRotation(IsRotation isRotation) {
        assertEquals(true, isRotation.isRotation("waterbottle", "erbottlewat"));
        assertEquals(false, isRotation.isRotation("waterbooooo", "erbbottlewat"));
    }

    @Test
    public void testIsRotation() {
        testIsRotation(Q8_IsRotation::isRotation);
    }

    @Test
    public void testIsRotation_Contains() {
        testIsRotation(Q8_IsRotation::isRotation_Contains);
    }

}