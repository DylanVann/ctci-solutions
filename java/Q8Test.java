import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import static org.junit.Assert.*;

public class Q8Test {

    interface IsRotation {
        boolean isRotation(String a, String b);
    }

    public void testIsRotation(IsRotation isRotation) {
        assertEquals(true, isRotation.isRotation("waterbottle", "erbottlewat"));
        assertEquals(false, isRotation.isRotation("waterbooooo", "erbbottlewat"));
    }

    @Test
    public void testIsRotation() {
        testIsRotation(Q8::isRotation);
    }

    @Test
    public void testIsRotation_Contains() {
        testIsRotation(Q8::isRotation_Contains);
    }

}