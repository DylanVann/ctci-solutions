package CH1.Q2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        assertEquals("", ReverseString.reverseString(""));
        assertEquals("a", ReverseString.reverseString("a"));
        assertEquals("Reversed.", ReverseString.reverseString(".desreveR"));
    }

    @Test
    public void testReverseString_Builder() {
        assertEquals("", ReverseString.reverseString_Builder(""));
        assertEquals("a", ReverseString.reverseString_Builder("a"));
        assertEquals("Reversed.", ReverseString.reverseString_Builder(".desreveR"));
    }

}