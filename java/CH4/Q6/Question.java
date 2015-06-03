package CH4.Q6;

import CtCILibrary.TreeNode;

public class Question {

    /**
     * Does not handle the case where either node is not in the tree.
     * @param root
     * @param nodeA
     * @param nodeB
     * @return
     */
    public TreeNode commonAncestor(TreeNode root, TreeNode nodeA, TreeNode nodeB) {
        if (nodeA == root || nodeB == root) return root;
        if (covers(root.left, nodeA) && covers(root.left, nodeB)) return commonAncestor(root.left, nodeA, nodeB);
        if (covers(root.right, nodeA) && covers(root.right, nodeB)) return commonAncestor(root.right, nodeA, nodeB);
        return root;
    }
    private boolean covers(TreeNode root, TreeNode node) {
        if (root == null) return false;
        if (root == node) return true;
        return covers(root.left, node) || covers(root.right, node);
    }

    /**
     * If you have a very large tree with many levels it may be better to look up from each node.
     * Store the parent nodes in a Set and then return the first common parent. This could be much faster.
     */
}
