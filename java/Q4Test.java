import org.junit.Test;

import static org.junit.Assert.*;
public class Q4Test {

    interface AreAnagrams {
        boolean areAnagrams(String a, String b);
    }

    public void testAreAnagrams(AreAnagrams areAnagrams) {
        assertEquals(true, areAnagrams.areAnagrams("silent", "silent"));
        assertEquals(true, areAnagrams.areAnagrams("silent", "listen"));
        assertEquals(false, areAnagrams.areAnagrams("silent", "quiet"));
    }

    @Test
    public void testAreAnagrams_Sort() throws Exception {
        testAreAnagrams(Q4::areAnagrams_Sort);
    }

    @Test
    public void testAreAnagrams_Array() throws Exception {
        testAreAnagrams(Q4::areAnagrams_Array);
    }

}