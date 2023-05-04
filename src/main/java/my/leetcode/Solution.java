package my.leetcode;

class Solution {
    public char findTheDifference(String s, String t) {
        int[] charPresent = new int[26];
        s.chars().forEach(a -> {
            charPresent[a - 'a']++;
        });
        for (int i = 0; i < t.length(); i++) {
            char charAt = t.charAt(i);
            int j = charAt - 'a';
            if (charPresent[j] == 0) {
                return charAt;
            }
            charPresent[j]--;
        }
        return 'a';
    }
}