package my.leetcode;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (doesItRepeatInString(s.substring(0, i + 1), s))
                return true;
        }
        return false;
    }

    private boolean doesItRepeatInString(String searchTerm, String s) {
        int searchTermLength = searchTerm.length();
        int i = searchTermLength;
        if (s.length() % searchTermLength != 0)
            return false;
        while (i < s.length()) {
            if (!s.substring(i, i + searchTermLength).equals(searchTerm))
                return false;
            i += searchTermLength;
        }
        return true;
    }
}