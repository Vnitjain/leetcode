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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traverseTree(root, 0, targetSum);
    }

    boolean traverseTree(TreeNode currentNode, int currentSum, int target) {
        if (currentNode == null)
            return false;
        int newSum = currentNode.val + currentSum;
        if(newSum == target && currentNode.left == null && currentNode.right == null)
            return true;
        return traverseTree(currentNode.left, newSum, target) || traverseTree(currentNode.right, newSum, target);
    }
}