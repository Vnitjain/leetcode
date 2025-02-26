package my.leetcode;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int i = 0, j = 0;

        while (j < t.length()) {
            if (i == s.length())
                return true;
            if (s.charAt(i) == t.charAt(j))
                i++;

            j++;
        }
        return i == s.length();
    }
}
