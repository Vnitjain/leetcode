package my.leetcode;

//https://leetcode.com/problems/remove-letter-to-equalize-frequency/
class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char current = word.charAt(i);
            freq[current - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                freq[i]--;
                if (checkIfAllEqual(freq)) {
                    return true;
                }
                freq[i]++;
            }
        }
        return false;
    }

    public boolean checkIfAllEqual(int[] a) {
        int number = -1;
        for (int i = 0; i < a.length; i++) {
            int currentInt = a[i];
            if (currentInt != 0) {
                if (number == -1) {
                    number = currentInt;
                } else if (number != currentInt) {
                    return false;
                }
            }
        }
        return true;
    }
}