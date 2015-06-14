package CH8.Q6;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class PaintBucketTest {

    @Test
    public void testPaintBucket() throws Exception {
        Color[][] input = {
                {Color.BLACK, Color.BLUE, Color.BLACK},
                {Color.BLUE, Color.BLUE, Color.BLACK},
                {Color.BLACK, Color.BLUE, Color.BLACK},
        };
        Color[][] expectedResult = {
                {Color.BLACK, Color.RED, Color.GREEN},
                {Color.RED, Color.RED, Color.GREEN},
                {Color.BLACK, Color.RED, Color.GREEN},
        };
        Color[][] result = {
                {Color.BLACK, Color.BLUE, Color.BLACK},
                {Color.BLUE, Color.BLUE, Color.BLACK},
                {Color.BLACK, Color.BLUE, Color.BLACK},
        };
        PaintBucket.paintBucket(result, 1, 1, Color.RED);
        PaintBucket.paintBucket(result, 0, 2, Color.GREEN);
        assertArrayEquals(expectedResult, result);
    }

}