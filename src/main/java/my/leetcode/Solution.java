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
    public TreeNode searchBST(TreeNode root, int val) {
        return traverseTree(root, val);
    }

    private TreeNode traverseTree(TreeNode root, int val) {
        if (root == null)
            return root;
        if (root.val == val)
            return root;
        TreeNode left = traverseTree(root.left, val);
        if (left != null)
            return left;
        TreeNode right = traverseTree(root.right, val);
        if (right != null)
            return right;
        return null;
    }
}
