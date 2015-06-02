package CH3.Q6;

import java.util.Stack;

public class Question {

    /**
     * Sorts a stack using another stack.
     *
     * Time: O(n^2)
     * Space: O(n)
     *
     * @param stack The stack to sort.
     * @return The sorted stack, ascending order.
     */
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        // Ret will be sorted in the correct order at all times,
        // although it will not contain all the values until the sort is complete.
        Stack<Integer> ret = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!ret.isEmpty() && ret.peek() > temp) {
                // If temp is smaller than the value on ret, put the value from ret onto stack.
                // Keep going until temp is greater than the value on ret.
                // This way ret is kept in ascending order.
                stack.push(ret.pop());
            }
            ret.push(temp);
        }
        return ret;
    }

}
