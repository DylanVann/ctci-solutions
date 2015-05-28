import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class Q1Test {

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void testIsUniqueChars() {
        // ASCII
        assertEquals(true, Q1.isUniqueChars("True."));
        assertEquals(false, Q1.isUniqueChars("False..."));
        // Doesn't handle other characters very well ಠ_ಠ.
        // Throws IndexOutOfBoundsException.
        exception.expect(ArrayIndexOutOfBoundsException.class);
        assertEquals(false, Q1.isUniqueChars("ಠ_ಠ"));
    }

    @Test
    public void testIsUniqueCharsBits() {
        assertEquals(true, Q1.isUniqueCharsBits("True."));
        assertEquals(false, Q1.isUniqueCharsBits("False..."));
        // Does not work for unicode characters.
        assertEquals(true, Q1.isUniqueCharsBits("●︵•"));
        assertNotEquals(false, Q1.isUniqueCharsBits("ಠ_ಠ"));
    }

    @Test
    public void testIsUniqueCharsSet() {
        assertEquals(true, Q1.isUniqueCharsSet("True."));
        assertEquals(false, Q1.isUniqueCharsSet("False..."));
        // Handles all unicode characters.
        assertEquals(true, Q1.isUniqueCharsSet("●︵•"));
        assertEquals(false, Q1.isUniqueCharsSet("ಠ_ಠ"));
    }

}