package CH4_TreesAndGraphs;

import CtCILibrary.TreeNode;

import java.util.ArrayList;

public class Q8_PrintPathsThatSumToNumber {

    /**
     * @param root The root node to search from.
     * @param sum The sum to search for.
     */
    public void printSumPaths(TreeNode root, int sum) {
        printSumPaths(root, new ArrayList<Integer>(), sum);
    }

    /**
     * Design an algorithm to print all paths on a binary tree which sum up to a value.
     * The path can start on any node.
     *
     * This solution leaves out paths that go up then down or down then back up.
     *
     * @param head The node to look from.
     * @param buffer A buffer of previous values in the path.
     * @param sum The sum to look for.
     */
    private void printSumPaths(TreeNode head, ArrayList<Integer> buffer, int sum) {
        if (head == null) return;
        buffer.add(head.data);

        // Check if this is the end of a path.
        int tmp = sum;
        for (int i = buffer.size() - 1 ; i > 0 ; i--) {
            tmp -= buffer.get(i);
            if (tmp == 0) {
                ArrayList<Integer> subList = (ArrayList<Integer>) buffer.subList(buffer.size() - 1, i);
                print(subList);
            }
        }

        // Check children.
        printSumPaths(head.left, new ArrayList<>(buffer), sum);
        printSumPaths(head.right, new ArrayList<>(buffer), sum);
    }

    void print(ArrayList<Integer> buffer) {
        for (int i : buffer) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
