package my.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
    private final List<Integer> inOrderList = new ArrayList<>();
    private final Iterator<Integer> inOrderListIterator;
    private int maxHeight = Integer.MIN_VALUE;

    public BSTIterator(TreeNode root) {
        converToInorderList(root, 1);
        inOrderListIterator = inOrderList.iterator();

        Integer[] finalArray = new Integer[maxHeight];
        inOrderList.toArray(finalArray);
        System.out.println(finalArray);
    }

    public int next() {
        return inOrderListIterator.next();
    }

    public boolean hasNext() {
        return inOrderListIterator.hasNext();
    }

    private void converToInorderList(TreeNode root, int height) {
        if (root != null) {
            maxHeight = Math.max(maxHeight, height);
            converToInorderList(root.left, height + 1);
            inOrderList.add(root.val);
            converToInorderList(root.right, height + 1);
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */