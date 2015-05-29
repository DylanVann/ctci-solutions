package CH2.Q2;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {

    @Test
    public void testNthLastNode() throws Exception {
        LinkedListNode list = AssortedMethods.createLinkedListFromArray(new int[]{1,2,3,4,5});

        LinkedListNode nthLast = Question.nthLastNode(list, 4);
        assertEquals(2, nthLast.data);

        nthLast = Question.nthLastNode(list, 3);
        assertEquals(3, nthLast.data);
    }

}