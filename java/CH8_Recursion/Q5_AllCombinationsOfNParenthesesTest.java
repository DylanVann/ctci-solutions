package CH8_Recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class Q5_AllCombinationsOfNParenthesesTest {

    @Test
    public void testAllCombinationsOfNParentheses() throws Exception {
        String[] expectedResult = {"()()()", "()(())", "(())()", "(()())", "((()))"};
        ArrayList<String> expectedResultList = new ArrayList<>();
        Collections.addAll(expectedResultList, expectedResult);
        ArrayList<String> resultList = Q5_AllCombinationsOfNParentheses.allCombinationsOfNParentheses(3);
        for (String s : resultList) System.out.println(s);

        assertEquals(true, expectedResultList.size() == resultList.size());
        assertEquals(true, expectedResultList.containsAll(resultList));


    }
}
