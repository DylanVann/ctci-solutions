package CH2_LinkedLists;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_NthLastNodeTest {

    @Test
    public void testNthLastNode() throws Exception {
        LinkedListNode list = AssortedMethods.createLinkedListFromArray(new int[]{1,2,3,4,5});

        LinkedListNode nthLast = Q2_NthLastNode.nthLastNode(list, 4);
        assertEquals(2, nthLast.data);

        nthLast = Q2_NthLastNode.nthLastNode(list, 3);
        assertEquals(3, nthLast.data);
    }

}
