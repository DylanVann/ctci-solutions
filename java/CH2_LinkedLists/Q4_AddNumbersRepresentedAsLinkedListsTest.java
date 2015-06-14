package CH2_LinkedLists;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_AddNumbersRepresentedAsLinkedListsTest {

    @Test
    public void testAddLists() throws Exception {
        LinkedListNode listA = AssortedMethods.createLinkedListFromArray(new int[]{4,3,1,5});
        LinkedListNode listB = AssortedMethods.createLinkedListFromArray(new int[]{5,9,2});
        LinkedListNode expectedOutput = AssortedMethods.createLinkedListFromArray(new int[]{9,2,4,5});

        LinkedListNode output = Q4_AddNumbersRepresentedAsLinkedLists.addLists(listA, listB, 0);

        assertArrayEquals(expectedOutput.toIntArray(), output.toIntArray());
    }

}
