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
        exception.expect(ArrayIndexOutOfBoundsException.class);
        // Doesn't handle other characters very well ಠ_ಠ.
        assertEquals(false, Q1.isUniqueChars("ಠ_ಠ"));
    }

    @Test
    public void testIsUniqueCharsBits() {
        assertEquals(true, Q1.isUniqueCharsBits("True."));
        assertEquals(false, Q1.isUniqueCharsBits("False..."));
        // Handles all unicode characters.
        assertEquals(true, Q1.isUniqueCharsBits("●︵•"));
        assertEquals(false, Q1.isUniqueCharsBits("ಠ_ಠ"));
    }

}