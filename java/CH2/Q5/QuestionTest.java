package CH2.Q5;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {

    @Test
    public void testFindLoopStart() throws Exception {
        LinkedListNode list = AssortedMethods.createLinkedListFromArray(new int[]{1,2,3,4,5,6,7,8,9});
        // Link 9 to 5.
        LinkedListNode node5 = list.next.next.next.next;
        LinkedListNode node9 = list.next.next.next.next.next.next.next.next;
        node9.next = node5;
        // Node 5 is the start of the loop.
        assertEquals(node5.data, Question.findLoopStart(list).data);
    }

}