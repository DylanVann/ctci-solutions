package CH3.Q3;

import java.util.Stack;

/**
 * Implement SetOfStacks, a data structure composed of multiple sub-stacks that behaves like a single stack.
 * A new stack should be created when a sub-stack reaches its set capacity.
 * A method, popSubStack, will pop a specific sub-stack.
 *
 * It almost seems like we could use a StackOfStacks...
 */
public class SetOfStacks {

    Stack<Stack<Integer>> subStacks = new Stack<>();
    int subStackCapacity;

    public SetOfStacks(int subStackCapacity) {
        this.subStackCapacity = subStackCapacity;
    }

    public void push(int v) {
        Stack<Integer> stack = subStacks.peek();
        if (stack.size() == subStackCapacity) {
            stack = new Stack<>();
            subStacks.push(stack);
        }
        stack.push(v);
    }

    public int pop() {
        Stack<Integer> stack = subStacks.peek();
        if (stack.size() == 0) {
            subStacks.pop();
            stack = subStacks.peek();
        }
        return stack.pop();
    }

    public int popSubStack(int index) {
        Stack<Integer>stack = subStacks.get(index);
        return stack.pop();
    }

}
