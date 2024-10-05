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
    int count;

    public int countNodes(TreeNode root) {
        count = 0;
        traverseTree(root);
        return count;
    }

    private void traverseTree(TreeNode currentNode) {
        if (currentNode == null)
            return;
        if (currentNode.right == null || currentNode.left != null)
            count++;
        traverseTree(currentNode.left);
        traverseTree(currentNode.right);
    }
}