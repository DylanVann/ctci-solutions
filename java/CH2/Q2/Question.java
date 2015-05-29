package CH2.Q2;

import CtCILibrary.LinkedListNode;

public class Question {

    /**
     * Find the nth to last element in a singly linked list.
     *
     * @param node
     * @param n
     * @return The nth to last element.
     */
    public static LinkedListNode nthLastNode(LinkedListNode node, int n) {
        LinkedListNode nthLastNode = node;
        // Skip ahead n-1 steps. So if node is last nthLast is nthLast.
        for (int i = 0 ; i < n - 1 ; i++) {
            if (node == null) return null;
            node = node.next;
        }
        // Increment nthLast and node in sync until the end is reached.
        while(node.next != null) {
            nthLastNode = nthLastNode.next;
            node = node.next;
        }
        return nthLastNode;
    }

}
