package CH8.Q6;

import java.awt.*;

public class PaintBucket {

    public static void paintBucket(Color[][] image, int x, int y, Color fill) {
        paintBucket(image, x, y, image[x][y], fill);
    }

    public static void paintBucket(Color[][] image, int x, int y, Color original, Color fill) {
        if (x < 0 || x >= image[0].length) return;
        if (y < 0 || y >= image.length) return;
        if (image[x][y] == original) {
            image[x][y] = fill;
            paintBucket(image, x-1, y, original, fill);
            paintBucket(image, x, y-1, original, fill);
            paintBucket(image, x+1, y, original, fill);
            paintBucket(image, x, y+1, original, fill);
        }
    }

}
