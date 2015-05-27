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
    public void testReverseStringBuilder() {
        assertEquals("", Q2.reverseStringBuilder(""));
        assertEquals("a", Q2.reverseStringBuilder("a"));
        assertEquals("Reversed.", Q2.reverseStringBuilder(".desreveR"));
    }

}