package my.leetcode;

class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        for (int i = 0; i < haystack.length() - needleLength + 1; i++) {
            int j = 0;
            while (j < needleLength) {
                if (needle.charAt(j) != haystack.charAt(j + i)) {
                    break;
                }
                j++;
            }
            if (j == needleLength) {
                return i;
            }
        }
        return -1;
    }
}