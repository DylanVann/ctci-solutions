package CH4_TreesAndGraphs;

import CtCILibrary.TreeNode;

public class Q3_CreateMinimalBST {

    private static TreeNode addToTree(int arr[], int start, int end) {
        if (end < start) return null;
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = addToTree(arr, start, mid - 1);
        n.right = addToTree(arr, mid + 1, end);
        return n;
    }

    public static TreeNode createBST(int arr[]) {
        return addToTree(arr, 0, arr.length - 1);
    }

}
