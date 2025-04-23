package my.leetcode;

class Solution {
    public char findTheDifference(String s, String t) {
        int[] alphabets = new int[26];

        for (char i : s.toCharArray())
            alphabets[i - 'a']++;

        for (char i : t.toCharArray()) {
            int character = i - 'a';
            if (alphabets[character]-- < 1)
                return i;
        }
        return '0';
    }
}