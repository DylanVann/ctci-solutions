package CH4_TreesAndGraphs;

import CtCILibrary.TreeNode;

public class Q5_GetSuccessorInTree {

    public static TreeNode getSuccessor(TreeNode n) {
        if (n == null) return null;

        if (n.parent == null || n.right != null) {
            return leftMostChild(n);
        }
        else {
            TreeNode parent = n.parent;
            while (parent.parent != null) {
                if (parent.left == n) {
                    return parent;
                }
                else {
                    n = n.parent;
                    parent = parent.parent;
                }
            }
            return parent;
        }
    }

    private static TreeNode leftMostChild(TreeNode n) {
        if (n == null) return null;
        while (n.left != null) n = n.left;
        return n;
    }
}
