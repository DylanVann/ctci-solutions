package CH1.Q2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {

    @Test
    public void testReverseString() {
        assertEquals("", Question.reverseString(""));
        assertEquals("a", Question.reverseString("a"));
        assertEquals("Reversed.", Question.reverseString(".desreveR"));
    }

    @Test
    public void testReverseString_Builder() {
        assertEquals("", Question.reverseString_Builder(""));
        assertEquals("a", Question.reverseString_Builder("a"));
        assertEquals("Reversed.", Question.reverseString_Builder(".desreveR"));
    }

}