package my.leetcode;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return isRepeatingPattern(0, "", s);
    }

    private boolean isRepeatingPattern(int currentIndex, String previous, String s) {
        if (currentIndex < s.length() - 1) {
            previous = previous + String.valueOf(s.charAt(currentIndex));
            if (doesItRepeatInString(previous, s))
                return true;
            return isRepeatingPattern(currentIndex + 1, previous, s);
        }
        return false;
    }

    public boolean doesItRepeatInString(String previous, String s) {
        int prevLength = previous.length();
        int i = prevLength;
        if (s.length() % prevLength != 0)
            return false;
        while (i < s.length()) {
            if (!s.substring(i, i + prevLength).equals(previous)) {
                return false;
            }
            i += prevLength;
        }
        return true;
    }
}