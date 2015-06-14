package CH1;

public class ZeroRowsAndColumnsContainingZeros {

    /**
     * If an element in the matrix is zero, zero the entire row and column.
     *
     * @param mat The matrix.
     */
    public static void setZeros(int[][] mat) {
        boolean[] zeroRows = new boolean[mat.length];
        boolean[] zeroCols = new boolean[mat[0].length];
        for (int i = 0 ; i < mat.length ; i++) {
            for (int j = 0 ; j < mat[0].length ; j++) {
                if (mat[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for (int i = 0 ; i < mat.length ; i++) {
            for (int j = 0 ; j < mat[0].length ; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    mat[i][j] = 0;
                }
            }
        }
    }

}
