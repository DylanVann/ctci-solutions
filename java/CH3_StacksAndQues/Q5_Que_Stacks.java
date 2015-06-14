package CH3_StacksAndQues;

import java.util.Stack;

public class Q5_Que_Stacks<T> {

    Stack<T> newestOnTop = new Stack<>();
    Stack<T> oldestOnTop = new Stack<>();

    public int size() {
        return newestOnTop.size() + oldestOnTop.size();
    }

    public void enqueue(T value) {
        newestOnTop.push(value);
    }

    public T dequeue() {
        if (!oldestOnTop.empty()) return oldestOnTop.pop();
        while (!newestOnTop.empty()) oldestOnTop.push(newestOnTop.pop());
        return oldestOnTop.pop();
    }

    public T peek() {
        if (!oldestOnTop.empty()) return oldestOnTop.pop();
        while (!newestOnTop.empty()) oldestOnTop.push(newestOnTop.pop());
        return oldestOnTop.peek();
    }

}
