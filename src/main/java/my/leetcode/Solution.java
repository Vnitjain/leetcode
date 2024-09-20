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
    public TreeNode invertTree(TreeNode root) {
        traverseTree(root);
        return root;
    }

    private void traverseTree(TreeNode currentNode) {
        if (currentNode != null) {
            TreeNode temp = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = temp;
        } else {
            return;
        }
        traverseTree(currentNode.left);
        traverseTree(currentNode.right);
    }
}
