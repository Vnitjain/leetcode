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
    int maxLength = 0;

    public int longestZigZag(TreeNode root) {
        traverseTree(root, 0, 0);
    }

    private int traverseTree(TreeNode root, int carry, int previous) {
        if (root != null) {
            if (previous == -1) {
            }
            traverseTree(root.left, 1);
            traverseTree(root.right, 1);
        }
    }
}
