package my.leetcode;

public class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3)
            return false;

        word = word.toLowerCase();
        boolean hasConsonant = false;
        boolean hasVowel = false;
        for (int i = 0; i < word.length(); i++) {
            char charAt = word.charAt(i);
            if (Character.isAlphabetic(charAt)) {
                if (isVowel(charAt)) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            } else if (Character.isDigit(charAt)) {

            } else {
                return false;
            }
        }
        return hasConsonant && hasVowel;
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }
}
