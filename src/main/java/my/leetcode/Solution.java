package my.leetcode;

public class Solution {
    public int maxVowels(String s, int k) {
        int currentStringVowels = 0;
        int maxVowels = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++)
            if (isVowel(s.charAt(i)))
                currentStringVowels++;

        maxVowels = Math.max(maxVowels, currentStringVowels);

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k)))
                currentStringVowels--;

            if (isVowel(s.charAt(i)))
                currentStringVowels++;

            maxVowels = Math.max(maxVowels, currentStringVowels);
        }
        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
