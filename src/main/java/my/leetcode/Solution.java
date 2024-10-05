package my.leetcode;

public class Solution {
    int sum;

    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        traverseTree(root);
        return sum;
    }

    private void traverseTree(TreeNode currentNode) {
        if (currentNode == null)
            return;
        if (currentNode.left != null && currentNode.left.left == null && currentNode.left.right == null)
            sum += currentNode.left.val;
        traverseTree(currentNode.left);
        traverseTree(currentNode.right);
    }
}

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
