package CH2_LinkedLists;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_DeleteNodeTest {

    @Test
    public void testDeleteNode() throws Exception {
        LinkedListNode input = AssortedMethods.createLinkedListFromArray(new int[]{1,2,3,4,5});
        LinkedListNode output = AssortedMethods.createLinkedListFromArray(new int[]{1,2,3,4,5});
        LinkedListNode expectedOutput = AssortedMethods.createLinkedListFromArray(new int[]{1,2,4,5});
        LinkedListNode nodeToDelete = output.next.next;
        Q3_DeleteNode.deleteNode(nodeToDelete);
        assertArrayEquals(expectedOutput.toIntArray(), output.toIntArray());
    }

}
