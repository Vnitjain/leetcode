package my.leetcode;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, word1Length = word1.length(), word2Length = word2.length();
        while (i < word1Length || i < word2Length) {
            if (i < word1Length) {
                merged = merged.append(word1.charAt(i));
            }
            if (i < word2Length) {
                merged = merged.append(word2.charAt(i));
            }
            i++;
        }
        return merged.toString();
    }
}