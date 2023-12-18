package my.leetcode;

public class Solution {
    public int countSegments(String s) {
        if (s.length() == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (s.length() == i + 1 || s.charAt(i + 1) == ' ')) {
                count++;
            }
        }
        return count;
    }
}
