package CH3_StacksAndQues;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_StackMinTest {

    @Test
    public void testMin() throws Exception {
        Q2_StackMin stack = new Q2_StackMin();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(6);

        assertEquals(3, stack.min());
        stack.pop();
        assertEquals(3, stack.min());
        stack.pop();
        assertEquals(4, stack.min());
        stack.pop();
        assertEquals(5, stack.min());
    }
}
