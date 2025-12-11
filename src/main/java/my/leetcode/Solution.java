package my.leetcode;

public class Solution {
    public int countKeyChanges(String s) {
        int finalCount = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) != s.charAt(i + 1) && (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 32))) {
                finalCount++;
            }
        }
        return finalCount;
    }
}
