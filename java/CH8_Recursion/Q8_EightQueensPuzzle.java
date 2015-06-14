package CH8_Recursion;

public class Q8_EightQueensPuzzle {

    /**
     * The eight queens puzzle is the problem of placing eight chess queens on an 8×8 chessboard so that no two queens threaten each other.
     * Thus, a solution requires that no two queens share the same row, column, or diagonal.
     *
     * https://en.wikipedia.org/wiki/Eight_queens_puzzle
     */
    public static int printEightQueensSolutions() {
        return printEightQueensSolutions(0, new int[8], 0);
    }

    static int printEightQueensSolutions(int row, int[] columnForRow, int solCount) {
        if (row == 8) {
            printBoard(columnForRow);
            solCount += 1;
        }
        else {
            for (int column = 0 ; column < 8 ; column++) {
                if (isValid(row, column, columnForRow)) {
                    columnForRow[row] = column;
                    solCount += printEightQueensSolutions(row + 1, columnForRow, 0);
                }
            }
        }
        return solCount;
    }

    /**
     * Determines if a
     * @param column
     * @param row
     * @param columnForRow
     * @return
     */
    static boolean isValid(int row, int column, int[] columnForRow) {
        for (int i = 0 ; i < row ; i++) {
            if (columnForRow[i] == column) {
                // A previously placed queen is in this column.
                return false;
            }
            if (Math.abs(columnForRow[i] - column) == Math.abs(i - row)) {
                // A previously placed queen is on this diagonal.
                return false;
            }
        }
        return true;
    }

    static void printBoard(int[] columnForRow) {
        for (int i = 0 ; i < 8 ; i++) {
            for (int j = 0 ; j < 8 ; j++) {
                if (j == columnForRow[i]) System.out.print('Q');
                else if (j%2 == 0) System.out.print('■');
                else System.out.print('□');
            }
            System.out.println();
        }
        System.out.println("--------");
    }

}
