package my.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    Map<Integer, Integer> freq;
    int max;

    public int[] findMode(TreeNode root) {
        freq = new HashMap<>();
        max = Integer.MIN_VALUE;
        traverseTree(root);
        List<Integer> result = new ArrayList<>();
        for (int key : freq.keySet()) {
            if (freq.get(key) == max)
                result.add(key);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private void traverseTree(TreeNode curr) {
        if (curr == null)
            return;
        freq.put(curr.val, freq.getOrDefault(curr.val, 0) + 1);
        max = freq.get(curr.val) > max ? freq.get(curr.val) : max;
        traverseTree(curr.left);
        traverseTree(curr.right);
    }
}
