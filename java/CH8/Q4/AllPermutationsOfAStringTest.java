package CH8.Q4;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AllPermutationsOfAStringTest {

    @Test
    public void testAllPermutationsOfAString() throws Exception {
        String string = "abc";
        String[] expectedResult = {"abc","bac","bca","acb","cab","cba"};
        ArrayList<String> resultList = AllPermutationsOfAString.allPermutationsOfAString(string);
        String[] result = new String[resultList.size()];
        for (int i = 0 ; i < resultList.size() ; i++) {
            result[i] = resultList.get(i);
        }
        assertArrayEquals(expectedResult, result);
    }
}