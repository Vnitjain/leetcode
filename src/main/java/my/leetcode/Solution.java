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
    int maxCount = 0;

    public int longestZigZag(TreeNode root) {
        traverseTree(root.left, true, 1);
        traverseTree(root.right, false, 1);
        return maxCount;
    }

    private void traverseTree(TreeNode currentNode, boolean isLeft, int count) {
        if (currentNode == null)
            return;
        if (isLeft) {
            traverseTree(currentNode.left, true, 1);
            traverseTree(currentNode.right, false, count + 1);
        } else {
            traverseTree(currentNode.left, true, count + 1);
            traverseTree(currentNode.right, false, 1);
        }
        maxCount = Math.max(maxCount, count);
    }
}
