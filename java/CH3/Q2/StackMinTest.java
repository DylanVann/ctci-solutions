package CH3.Q2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackMinTest {

    @Test
    public void testMin() throws Exception {
        StackMin stack = new StackMin();
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