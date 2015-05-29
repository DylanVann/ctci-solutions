package CH2.Q4;

import CtCILibrary.LinkedListNode;

public class Question {

    /**
     * The lists represent numbers. Digits stored in reverse order.
     * This function adds the lists and produces an output list in the same format.
     * ex.
     * (3->1->5) + (5,9,2) = (8,0,8)
     * 513 + 295 = 808
     *
     * This is done by adding the smallest digit and keeping track of a carry that goes into the next digit.
     *
     * @param n1 First number, in list form.
     * @param n2 Second number, in list form.
     * @return The result of the addition, in list form.
     */
    public static LinkedListNode addLists(LinkedListNode n1, LinkedListNode n2, int carry) {
        if (n1 == null && n2 == null && carry == 0) {
            return null;
        }

        LinkedListNode digit = new LinkedListNode();
        int value = carry;
        if (n1 != null) {
            value += n1.data;
        }
        if (n2 != null) {
            value += n2.data;
        }
        digit.data = value % 10;
        if (n1 != null || n2 != null) {
            LinkedListNode n1Next = n1 == null ? null : n1.next;
            LinkedListNode n2Next = n2 == null ? null : n2.next;
            LinkedListNode nextDigit = addLists(n1Next, n2Next, value >= 10 ? 1 : 0);
            digit.next = nextDigit;
        }
        return digit;
    }

}
