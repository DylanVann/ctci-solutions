import org.junit.Test;

import static org.junit.Assert.*;

public class Q3Test {

    public interface RemoveDuplicateCharacters {
        String removeDuplicateCharacters(String str);
    }

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
    public void testRemoveDuplicateCharacters_Set() throws Exception {
        testRemoveDuplicateCharacters(Q3::removeDuplicateCharacters_Set);
    }

}