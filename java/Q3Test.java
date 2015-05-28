import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class Q3Test {

    /**
     * Interface with a function to remove duplicate characters.
     */
    public interface RemoveDuplicateCharacters {
        public String removeDuplicateCharacters(String str);
    }

    /**
     * JUnit tests if a function removes duplicate characters correctly.
     *
     * @param removeFunction Function that removes duplicate characters.
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
        testRemoveDuplicateCharacters(Q3::removeDuplicateCharacters);
    }

    @Test
    public void testRemoveDuplicateCharactersSet() throws Exception {
        testRemoveDuplicateCharacters(Q3::removeDuplicateCharactersSet);
    }

}