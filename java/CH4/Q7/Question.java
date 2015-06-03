package CH4.Q7;

import CtCILibrary.TreeNode;

public class Question {

    public boolean containsTree(TreeNode tree, TreeNode subTree) {
        if (subTree == null) return true;
        else return subTree(tree, subTree);
    }

    private boolean subTree(TreeNode tree, TreeNode subTree) {
        if (tree == null) return false;
        if (tree.data == subTree.data && treeEquals(tree, subTree)) return true;
        return (subTree(tree.left, subTree) || subTree(tree.right, subTree));
    }

    private boolean treeEquals(TreeNode nodeA, TreeNode nodeB) {
        if (nodeA == null && nodeB == null) return true;
        if (nodeA == null || nodeB == null) return false;
        if (nodeA.data != nodeB.data) return false;
        return treeEquals(nodeA.left, nodeB.left) && treeEquals(nodeA.right, nodeB.right);
    }
}
