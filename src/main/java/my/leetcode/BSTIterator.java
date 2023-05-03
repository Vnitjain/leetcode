package my.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class BSTIterator {
    private final Integer[] finalArray;
    private int pointer = 0;

    public BSTIterator(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();
        converToInorderList(root, 1, inOrderList);
        finalArray = inOrderList.toArray(new Integer[0]);
    }

    public int next() {
        return finalArray[pointer++];
    }

    public boolean hasNext() {
        return pointer < finalArray.length;
    }

    private void converToInorderList(TreeNode root, int height, List<Integer> inOrderList) {
        if (root != null) {
            converToInorderList(root.left, height + 1, inOrderList);
            inOrderList.add(root.val);
            converToInorderList(root.right, height + 1, inOrderList);
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */