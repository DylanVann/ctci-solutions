package CH1.Q6;

public class Question {

    /**
     * Rotates a square matrix 90 degrees in place. CCW.
     * <p/>
     * We can't do better than n^2 because each element must be accessed to produce the new configuration.
     * <br>
     * Time: O(n^2)
     * <br>
     * Space: O(1)
     *
     * @param mat The matrix to rotate.
     */
    static void swapElementsInPlace(int[][] mat, int r1, int c1, int r2, int c2) {
        mat[r1][c1] ^= mat[r2][c2];
        mat[r2][c2] ^= mat[r1][c1];
        mat[r1][c1] ^= mat[r2][c2];
    }
    static void transpose(int[][] mat) {
        for (int i = 0 ; i < mat.length ; i++) {
            for (int j = (i+1) ; j < mat.length ; j++) {
                swapElementsInPlace(mat, i, j, j, i);
            }
        }
    }
    public static void rotateMatrix90_InPlace(int[][] mat) {
        transpose(mat);
        // Flip vertically.
        for (int i = 0 ; i < mat.length ; i++) {
            for (int j = 0 ; j < mat.length / 2 ; j++) {
                swapElementsInPlace(mat, i, j, i, mat.length - 1 - j);
            }
        }
    }

    /*
     * There's another interesting way of handling this problem.
     * You can keep track of the transform without applying it.
     * Then you apply it the next time you need to access a value, so it's like a new accessor.
     * There's no space usage, and there's no time usage until you need the values.
     * Probably a better solution, faster, more composable, non-destructive, more OO.
     */

}
