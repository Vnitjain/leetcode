package my.leetcode;

class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] finalResult = new int[word.length()];
        long remainder = 0;
        for (int i = 0; i < word.length(); i++) {
            remainder = ((remainder * 10) + (word.charAt(i) - '0')) % m;
            finalResult[i] = remainder == 0 ? 1 : 0;
        }
        return finalResult;
    }
}