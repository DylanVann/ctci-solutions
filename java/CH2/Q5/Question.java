package CH2.Q5;

import CtCILibrary.LinkedListNode;

public class Question {

    /**
     * Finds the node at the start of a loop in a linked list.
     *
     * @param n The linked list.
     * @return The node at the start of a loop. null if there is no loop.
     */
    public static LinkedListNode findLoopStart(LinkedListNode n) {
        LinkedListNode n1 = n;
        LinkedListNode n2 = n;

        // Find where n2 and n1 meet, if n2 moves twice as fast.
        while (n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
            if (n1 == n2) {
                // Found meeting.
                break;
            }

        }
        // Check if there is actually a loop, or if we reached the end of the list.
        if (n2.next == null) {
            return null;
        }

        // Move n1 to the beginning.
        // If n1 and n2 move in increments of 1 they will meet at the start of the loop.
        n1 = n;
        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }

        return n1;
    }
}
