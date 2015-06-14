package CH3_StacksAndQues;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_StackArrayTest {

    @Test
    public void testPush() throws Exception {
        Q1_StackArray stacks = new Q1_StackArray(10,3);
        stacks.push(0,1);
        stacks.push(2,5);

        assertEquals(1,stacks.peek(0));
        assertEquals(5,stacks.peek(2));
    }

    @Test
    public void testPop() throws Exception {
        Q1_StackArray stacks = new Q1_StackArray(10,3);
        stacks.push(0,1);
        stacks.push(2,5);
        stacks.push(0,4);

        assertEquals(4, stacks.pop(0));
        assertEquals(1,stacks.pop(0));
    }

    @Test
    public void testPeek() throws Exception {
        Q1_StackArray stacks = new Q1_StackArray(10,3);
        stacks.push(2,5);

        assertEquals(5,stacks.peek(2));
    }

    @Test
    public void testIsEmpty() throws Exception {
        Q1_StackArray stacks = new Q1_StackArray(10,3);
        stacks.push(2,5);

        assertEquals(true, stacks.isEmpty(0));
        assertEquals(false, stacks.isEmpty(2));
    }

    @Test
    public void testIsFull() throws Exception {
        Q1_StackArray stacks = new Q1_StackArray(10,3);
        assertEquals(false, stacks.isFull(0));
        for (int i = 0 ; i < 10 ; i++) {
            stacks.push(0, i);
        }
        assertEquals(true, stacks.isFull(0));
    }

}
