package my.leetcode;

public class Solution {
    public int maxVowels(String s, int k) {
        int currentStringVowels = 0;
        String vowels = "aeiou";
        int maxVowels = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++)
            if (vowels.indexOf(s.charAt(i)) > -1)
                currentStringVowels++;

        maxVowels = Math.max(maxVowels, currentStringVowels);

        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i - k)) > -1)
                currentStringVowels--;

            if (vowels.indexOf(s.charAt(i)) > -1)
                currentStringVowels++;

            maxVowels = Math.max(maxVowels, currentStringVowels);
        }
        return maxVowels;
    }
}
