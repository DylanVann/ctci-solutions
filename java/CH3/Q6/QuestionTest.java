package CH3.Q6;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class QuestionTest {

    @Test
    public void testSortStack() throws Exception {
        int[] inValues  = {1,3,5,4,6,8,7,9,2};
        int[] outValues = {1,2,3,4,5,6,7,8,9};

        Stack<Integer> input = new Stack<>();
        for (int i : inValues) input.push(i);

        Stack<Integer> output = new Stack<>();
        for (int i : outValues) output.push(i);

        assertArrayEquals(output.toArray(), Question.sortStack(input).toArray());
    }

}