package CH1_ArraysAndStrings;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class Q1_AreAllCharactersInAStringUniqueTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void testIsUniqueChars() {
        // ASCII
        assertEquals(true, Q1_AreAllCharactersInAStringUnique.isUniqueChars("True."));
        assertEquals(false, Q1_AreAllCharactersInAStringUnique.isUniqueChars("False..."));
        // Doesn't handle other characters very well ಠ_ಠ.
        // Throws IndexOutOfBoundsException.
        exception.expect(ArrayIndexOutOfBoundsException.class);
        assertEquals(true, Q1_AreAllCharactersInAStringUnique.isUniqueChars("●︵•"));
        assertNotEquals(false, Q1_AreAllCharactersInAStringUnique.isUniqueChars("ಠ_ಠ"));
    }

    @Test
    public void testIsUniqueCharsBits() {
        assertEquals(true, Q1_AreAllCharactersInAStringUnique.isUniqueChars_Bits("True."));
        assertEquals(false, Q1_AreAllCharactersInAStringUnique.isUniqueChars_Bits("False..."));
        // Does not work for unicode characters.
        assertEquals(true, Q1_AreAllCharactersInAStringUnique.isUniqueChars_Bits("●︵•"));
        assertNotEquals(false, Q1_AreAllCharactersInAStringUnique.isUniqueChars_Bits("ಠ_ಠ"));
    }

    @Test
    public void testIsUniqueCharsSet() {
        assertEquals(true, Q1_AreAllCharactersInAStringUnique.isUniqueChars_Set("True."));
        assertEquals(false, Q1_AreAllCharactersInAStringUnique.isUniqueChars_Set("False..."));
        // Handles all unicode characters.
        assertEquals(true, Q1_AreAllCharactersInAStringUnique.isUniqueChars_Set("●︵•"));
        assertEquals(false, Q1_AreAllCharactersInAStringUnique.isUniqueChars_Set("ಠ_ಠ"));
    }

}