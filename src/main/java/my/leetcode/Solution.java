package my.leetcode;

class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1)
            return true;
        if (isCapital(word.charAt(0))) {
            if (isCapital(word.charAt(1))) {
                for (int i = 2; i < word.length(); i++)
                    if (!isCapital(word.charAt(i)))
                        return false;
            } else {
                for (int i = 2; i < word.length(); i++)
                    if (isCapital(word.charAt(i)))
                        return false;
            }
        } else
            for (int i = 1; i < word.length(); i++)
                if (isCapital(word.charAt(i)))
                    return false;
        return true;
    }

    public boolean isCapital(char a) {
        return a <= 'z' && a >= 'a' ? false : true;
    }
}