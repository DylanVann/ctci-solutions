package CH1.Q5;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {

    interface SpaceReplace {
        String spaceReplace(String str);

    }

    public void testSpaceReplace(SpaceReplace spaceReplace) {
        assertEquals("Mr%20John%20Smith", spaceReplace.spaceReplace("Mr John Smith"));
    }

    @Test
    public void testReplaceStringSpaces() throws Exception {
        testSpaceReplace(Question::replaceStringSpaces);
    }

    @Test
    public void testReplaceStringSpaces_Easy() throws Exception {
        testSpaceReplace(Question::replaceStringSpaces_Easy);
    }

}