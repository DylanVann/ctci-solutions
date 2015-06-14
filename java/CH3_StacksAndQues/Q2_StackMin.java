package CH3_StacksAndQues;

import java.util.Stack;

/**
 * A stack with a min function that returns the smallest element.
 * <p/>
 * Each node keeps track of the min with it on the stack.
 * Checking the top node will give the answer for the full stack.
 * Checking any node will give the minimum between it and the bottom of the stack.
 */
public class Q2_StackMin extends Stack<Q2_StackMinNode> {

    public void push(int value) {
        Q2_StackMinNode node = new Q2_StackMinNode(value, Math.min(value, min()));
        super.push(node);
    }

    public int min() {
        if (this.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return peek().min;
        }
    }

}

