package CH4_TreesAndGraphs;

import CtCILibrary.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q4_CreateArraysForLevelsInATree {

    ArrayList<LinkedList<TreeNode>> linkedListsForLevels(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<>();
        LinkedList<TreeNode> parentLevelList = new LinkedList<>();
        parentLevelList.add(root);
        result.add(parentLevelList);
        LinkedList<TreeNode> levelList = parentLevelList;

        while(true) {
            parentLevelList = levelList;
            levelList = new LinkedList<>();
            for (TreeNode n : parentLevelList) {
                if (n != null) {
                    if (n.left != null) levelList.add(n.left);
                    if (n.right != null) levelList.add(n.right);
                }
            }
            if (levelList.size() > 0) result.add(levelList);
            else break;
        }
        return result;
    }
}
