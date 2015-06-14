package CH1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class AreAllCharactersInAStringUniqueTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void testIsUniqueChars() {
        // ASCII
        assertEquals(true, AreAllCharactersInAStringUnique.isUniqueChars("True."));
        assertEquals(false, AreAllCharactersInAStringUnique.isUniqueChars("False..."));
        // Doesn't handle other characters very well ಠ_ಠ.
        // Throws IndexOutOfBoundsException.
        exception.expect(ArrayIndexOutOfBoundsException.class);
        assertEquals(true, AreAllCharactersInAStringUnique.isUniqueCharsBits("●︵•"));
        assertNotEquals(false, AreAllCharactersInAStringUnique.isUniqueCharsBits("ಠ_ಠ"));
    }

    @Test
    public void testIsUniqueCharsBits() {
        assertEquals(true, AreAllCharactersInAStringUnique.isUniqueCharsBits("True."));
        assertEquals(false, AreAllCharactersInAStringUnique.isUniqueCharsBits("False..."));
        // Does not work for unicode characters.
        assertEquals(true, AreAllCharactersInAStringUnique.isUniqueCharsBits("●︵•"));
        assertNotEquals(false, AreAllCharactersInAStringUnique.isUniqueCharsBits("ಠ_ಠ"));
    }

    @Test
    public void testIsUniqueCharsSet() {
        assertEquals(true, AreAllCharactersInAStringUnique.isUniqueCharsSet("True."));
        assertEquals(false, AreAllCharactersInAStringUnique.isUniqueCharsSet("False..."));
        // Handles all unicode characters.
        assertEquals(true, AreAllCharactersInAStringUnique.isUniqueCharsSet("●︵•"));
        assertEquals(false, AreAllCharactersInAStringUnique.isUniqueCharsSet("ಠ_ಠ"));
    }

}