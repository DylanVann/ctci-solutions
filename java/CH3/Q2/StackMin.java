package CH3.Q2;

import java.util.Stack;

/**
 * A stack with a min function that returns the smallest element.
 * <p/>
 * Each node keeps track of the min with it on the stack.
 * Checking the top node will give the answer for the full stack.
 * Checking any node will give the minimum between it and the bottom of the stack.
 */
public class StackMin extends Stack<StackMinNode> {

    int[] array = new int[10];

    public void push(int value) {
        StackMinNode node = new StackMinNode(value, Math.min(value, min()));
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

