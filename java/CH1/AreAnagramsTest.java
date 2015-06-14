package CH1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreAnagramsTest {

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
        testAreAnagrams(CH1.AreAnagrams::areAnagrams_Sort);
    }

    @Test
    public void testAreAnagrams_Array() throws Exception {
        testAreAnagrams(CH1.AreAnagrams::areAnagrams_Array);
    }

}