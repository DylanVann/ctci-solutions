package CH2.Q1;

import CtCILibrary.LinkedListNode;

import java.util.HashMap;
import java.util.HashSet;

public class Question {

    /**
     * Removes duplicates from a linked list.
     *
     * Stores a map of previously encountered nodes to check new ones against.
     *
     * Time: O(n)
     * Space: O(n)
     *
     * @param n
     */
    public static void removeDuplicates(LinkedListNode n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        LinkedListNode prev = null;
        while (n != null) {
            if (map.containsKey(n.data)) prev.next = n.next;
            else {
                map.put(n.data, true);
                prev = n;
            }
            n = n.next;
        }
    }

    /**
     * Removes duplicates from a linked list.
     *
     * This can be done using a set. Same or better performance, no extra boolean.
     *
     * Time: O(n)
     * Space: O(n)
     *
     * @param n
     */
    public static void removeDuplicates_Set(LinkedListNode n) {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode prev = null;
        while (n != null) {
            if (set.contains(n.data)) prev.next = n.next;
            else {
                set.add(n.data);
                prev = n;
            }
            n = n.next;
        }
    }

    /**
     * Removed duplicates without using a buffer.
     *
     * On each new node it looks back through the previous nodes to see if this one is not a duplicate.
     * If it is a duplicate delete it from the list.
     *
     * Time: O(n^2)
     * Space: O(1)
     *
     * @param n
     */
    public static void removeDuplicates_NoBuffer(LinkedListNode n) {
        LinkedListNode prev = n;
        LinkedListNode curr = n.next;
        while (curr != null) {
            LinkedListNode checker = n;
            while (checker != curr) {
                if (checker.data == curr.data) {
                    // Remove current.
                    prev.next = curr.next;
                    curr = curr.next;
                    break;
                }
                checker = checker.next;
            }
            prev = curr;
            curr = curr.next;
        }
    }

}
