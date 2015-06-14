package CH1_ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_ReverseStringTest {

    @Test
    public void testReverseString() {
        assertEquals("", Q2_ReverseString.reverseString(""));
        assertEquals("a", Q2_ReverseString.reverseString("a"));
        assertEquals("Reversed.", Q2_ReverseString.reverseString(".desreveR"));
    }

    @Test
    public void testReverseString_Builder() {
        assertEquals("", Q2_ReverseString.reverseString_Builder(""));
        assertEquals("a", Q2_ReverseString.reverseString_Builder("a"));
        assertEquals("Reversed.", Q2_ReverseString.reverseString_Builder(".desreveR"));
    }

}