package CH2.Q3;

import CtCILibrary.LinkedListNode;

public class Question {

    /**
     * Deletes a node in a singly linked list.
     *
     * Replaces the node's data and next pointer with the data and next pointer from the next node.
     *
     * Cannot delete the node from the list if it is the last node.
     *
     * @param n
     */
    public static void deleteNode(LinkedListNode n) {
        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
    }

}
