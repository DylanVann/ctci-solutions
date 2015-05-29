import org.junit.Test;

import static org.junit.Assert.*;

public class Q2Test {

    @Test
    public void testReverseString() {
        assertEquals("", Q2.reverseString(""));
        assertEquals("a", Q2.reverseString("a"));
        assertEquals("Reversed.", Q2.reverseString(".desreveR"));
    }

    @Test
    public void testReverseString_Builder() {
        assertEquals("", Q2.reverseString_Builder(""));
        assertEquals("a", Q2.reverseString_Builder("a"));
        assertEquals("Reversed.", Q2.reverseString_Builder(".desreveR"));
    }

}