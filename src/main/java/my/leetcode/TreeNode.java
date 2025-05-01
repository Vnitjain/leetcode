package my.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
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

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> firstList = new ArrayList<Integer>();
        traverseTree(root1, firstList);
        List<Integer> secondList = new ArrayList<Integer>();
        traverseTree(root2, secondList);
        if (firstList.size() != secondList.size())
            return false;
        for (int i = 0; i < firstList.size(); i++)
            if (!firstList.get(i).equals(secondList.get(i))) {
                return false;
            }

        return true;
    }

    private void traverseTree(TreeNode root, List<Integer> integerList) {
        if (root != null) {
            if (root.left == null && root.right == null)
                integerList.add(root.val);
            traverseTree(root.left, integerList);
            traverseTree(root.right, integerList);
        }
    }
}