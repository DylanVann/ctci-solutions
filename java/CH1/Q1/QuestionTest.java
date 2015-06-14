package CH1.Q1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class QuestionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void testIsUniqueChars() {
        // ASCII
        assertEquals(true, Question.isUniqueChars("True."));
        assertEquals(false, Question.isUniqueChars("False..."));
        // Doesn't handle other characters very well ಠ_ಠ.
        // Throws IndexOutOfBoundsException.
        exception.expect(ArrayIndexOutOfBoundsException.class);
        assertEquals(true, Question.isUniqueCharsBits("●︵•"));
        assertNotEquals(false, Question.isUniqueCharsBits("ಠ_ಠ"));
    }

    @Test
    public void testIsUniqueCharsBits() {
        assertEquals(true, Question.isUniqueCharsBits("True."));
        assertEquals(false, Question.isUniqueCharsBits("False..."));
        // Does not work for unicode characters.
        assertEquals(true, Question.isUniqueCharsBits("●︵•"));
        assertNotEquals(false, Question.isUniqueCharsBits("ಠ_ಠ"));
    }

    @Test
    public void testIsUniqueCharsSet() {
        assertEquals(true, Question.isUniqueCharsSet("True."));
        assertEquals(false, Question.isUniqueCharsSet("False..."));
        // Handles all unicode characters.
        assertEquals(true, Question.isUniqueCharsSet("●︵•"));
        assertEquals(false, Question.isUniqueCharsSet("ಠ_ಠ"));
    }

}