package CH1_ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_RemoveDuplicateCharactersTest {

    /**
     * This is something I'll do often in my tests.
     *
     * Since we're testing multiple implementations of the same function we can define an interface for the function.
     *
     */
    public interface RemoveDuplicateCharacters {
        String removeDuplicateCharacters(String str);
    }

    /**
     * We have one function that performs tests for multiple implementations of a function.
     *
     * We pass in the specific function to test:
     *
     * ```
     * testRemoveDuplicateCharacters(Question::removeDuplicateCharacters);
     * ```
     *
     * @param removeFunction The function to test for removeDuplicateCharacters functionality.
     */
    public void testRemoveDuplicateCharacters(RemoveDuplicateCharacters removeFunction) {
        assertEquals("abcdefg", removeFunction.removeDuplicateCharacters("abccdeefg"));
        assertEquals("abcd", removeFunction.removeDuplicateCharacters("abcd"));
        assertEquals("a", removeFunction.removeDuplicateCharacters("aa"));
        assertEquals("a", removeFunction.removeDuplicateCharacters("aaaa"));
        assertEquals("ab", removeFunction.removeDuplicateCharacters("aabb"));
    }

    @Test
    public void testRemoveDuplicateCharacters() throws Exception {
        testRemoveDuplicateCharacters(Q3_RemoveDuplicateCharacters::removeDuplicateCharacters);
    }

    @Test
    public void testRemoveDuplicateCharacters_Set() throws Exception {
        testRemoveDuplicateCharacters(Q3_RemoveDuplicateCharacters::removeDuplicateCharacters_Set);
    }

}