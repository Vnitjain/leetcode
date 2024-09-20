package my.leetcode;

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
    int max = 0;

    public int maxDepth(TreeNode root) {
        traverseTree(root, 0);
        return max;
    }

    private void traverseTree(TreeNode currentNode, int currentDepth) {
        if(currentNode==null)
            return;
        currentDepth++;
        if (currentDepth > max)
            max = currentDepth;
        traverseTree(currentNode.left, currentDepth);
        traverseTree(currentNode.right, currentDepth);
    }
}