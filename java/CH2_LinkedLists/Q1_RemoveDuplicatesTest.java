package CH2_LinkedLists;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_RemoveDuplicatesTest {

    interface RemoveDuplicates {
        void removeDuplicates(LinkedListNode n);
    }

    void testRemoveDuplicates(RemoveDuplicates removeDuplicates) {
        LinkedListNode input = AssortedMethods.createLinkedListFromArray(new int[]{1, 2, 3, 3, 4, 1, 6, 8, 9});
        LinkedListNode output = AssortedMethods.createLinkedListFromArray(new int[]{1, 2, 3, 3, 4, 1, 6, 8, 9});
        LinkedListNode expectedOutput = AssortedMethods.createLinkedListFromArray(new int[]{1, 2, 3, 4, 6, 8, 9});

        removeDuplicates.removeDuplicates(output);

        System.out.println("Input:");
        AssortedMethods.printIntArray(input.toIntArray());
        System.out.println();
        System.out.println();

        System.out.println("Expected output:");
        AssortedMethods.printIntArray(expectedOutput.toIntArray());
        System.out.println();
        System.out.println();

        System.out.println("Output:");
        AssortedMethods.printIntArray(output.toIntArray());
        System.out.println();
        System.out.println();

        assertArrayEquals(expectedOutput.toIntArray(), output.toIntArray());
    }

    @Test
    public void testRemoveDuplicates() throws Exception {
        testRemoveDuplicates(Q1_RemoveDuplicates::removeDuplicates);
    }

    @Test
    public void testRemoveDuplicates_Set() throws Exception {
        testRemoveDuplicates(Q1_RemoveDuplicates::removeDuplicates_Set);
    }

    @Test
    public void testRemoveDuplicates_NoBuffer() throws Exception {
        testRemoveDuplicates(Q1_RemoveDuplicates::removeDuplicates_NoBuffer);
    }
}
