package my.leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    List<String> finaList;

    public List<String> binaryTreePaths(TreeNode root) {
        finaList = new ArrayList<>();
        traverseTree(root, "");
        return finaList;
    }

    private void traverseTree(TreeNode currentNode, String pathString) {
        if (currentNode == null)
            return;
        if (pathString.length() == 0)
            pathString = String.valueOf(currentNode.val);
        else
            pathString += "->" + currentNode.val;
        if (currentNode.left == null && currentNode.right == null)
            finaList.add(pathString);
        traverseTree(currentNode.left, pathString);
        traverseTree(currentNode.right, pathString);
    }
}