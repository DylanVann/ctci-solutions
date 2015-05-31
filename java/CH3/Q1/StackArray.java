package CH3.Q1;

import java.util.Arrays;

/**
 * Implements multiple stacks using a single array as the backing store.
 * <p/>
 * - Works for any number of stacks.
 * - No handling for when a user pushes too many items onto a stack.
 */
public class StackArray {
    int stackSize;
    // The backing storage.
    int[] array;
    // A pointer for each stack.
    int[] stackPointers;

    public StackArray(int stackSize, int numStacks) {
        this.stackSize = stackSize;
        array = new int[numStacks * stackSize];
        stackPointers = new int[numStacks];
        Arrays.fill(stackPointers, -1);
    }

    public void push(int stackIndex, int value) {
        // Increment stack pointer.
        stackPointers[stackIndex]++;
        // Calculate index.
        int index = stackIndex * stackSize + stackPointers[stackIndex];
        // Set value.
        array[index] = value;
    }

    public int pop(int stackIndex) {
        // Calculate index.
        int index = stackIndex * stackSize + stackPointers[stackIndex];
        // Get value at index.
        int value = array[index];
        // Erase value at index in array.
        array[index] = 0;
        // Decrement stack pointer.
        stackPointers[stackIndex]--;
        //Return value.
        return value;
    }

    public int peek(int stackIndex) {
        // Calculate index.
        int index = stackIndex * stackSize + stackPointers[stackIndex];
        // Get value at index.
        return array[index];
    }

    public boolean isEmpty(int stackIndex) {
        return stackPointers[stackIndex] == -1;
    }

    public boolean isFull(int stackIndex) {
        return stackPointers[stackIndex] == stackSize - 1;
    }

}
