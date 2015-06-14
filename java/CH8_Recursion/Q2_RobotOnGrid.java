package CH8_Recursion;

public class Q2_RobotOnGrid {

    /**
     * A robot is on an X by Y grid.
     * The robot is in the top left of the grid and must get to the bottom right.
     * The robot can only move down and right.
     * How many possible paths are there?
     *
     * To get to the opposite corner the robot must move down Y-1 cells and right X-1 cells.
     * So out of a total of Y-1 + X-1 moves the robot must choose X-1 moves to move right on.
     *
     * Choose(Y-1+X-1,X-1)
     */
    public static int numberOfPossiblePaths(int x, int y) {
        return binomial(y-1+x-1,x-1);
    }

    static int binomial(int n, int k) {
        int ret = 1;
        for (int i = 0 ; i < k ; i++) {
            ret = (ret * (n-i)) / (i+1);
        }
        return ret;
    }

}
