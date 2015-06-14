package CH3_StacksAndQues;

import java.util.ArrayList;
import java.util.Stack;

public class Q4_Hanoi {

    ArrayList<Stack<Integer>> pegs;
    boolean solved = false;

    public Q4_Hanoi(int n) {
        pegs = new ArrayList<>();
        // Create pegs as stacks.
        for (int i = 0 ; i < 3 ; i++) {
            pegs.add(new Stack<>());
        }
        // Add numbered discs to first peg.
        for (int i = 0 ; i < n ; i++) {
            pegs.get(0).add(n - 1);
        }
        solved = false;
    }

    public void moveDiscs() {
        moveDiscs(pegs.get(0).size(), 0, 1, 2);
    }

    public void moveDiscs(int n, int from, int inter, int to) {
        if (n == 1) {
            System.out.println("Disc " + n + " from " + from + " to " + to + ".");
            pegs.get(to).push(pegs.get(from).pop());
        }
        else {
            moveDiscs(n - 1, from, to, inter);

            System.out.println("Disc " + n + " from " + from + " to " + to + ".");
            pegs.get(to).push(pegs.get(from).pop());

            moveDiscs(n - 1, inter, from, to);
        }
    }

}
