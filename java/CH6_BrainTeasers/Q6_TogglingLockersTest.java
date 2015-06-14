package CH6_BrainTeasers;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q6_TogglingLockersTest {

    @Test
    public void testToggleLockers() throws Exception {
        // Create 100 closed lockers.
        boolean[] result = new boolean[100];
        Q6_TogglingLockers.toggleLockers(result);

        int[] openLockers = {1,4,9,16,25,36,49,64,81,100};
        boolean[] expectedResult = new boolean[100];
        for (int i : openLockers) {
            expectedResult[i-1] = true;
        }

        assertArrayEquals(intArrayFromBooleanArray(expectedResult), intArrayFromBooleanArray(result));
    }

    int[] intArrayFromBooleanArray(boolean[] booleanArray) {
        int[] intArray = new int[booleanArray.length];
        for (int i = 0 ; i < booleanArray.length ; i++) {
            if (booleanArray[i]) intArray[i] = 1;
        }
        return intArray;
    }

}
