package my.leetcode;

class Solution {
    public boolean digitCount(String num) {
        int[] count = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            int current = Character.digit(num.charAt(i), 10);
            if (current < num.length()) {
                count[current]++;
            } else {
                return false;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != Character.digit(num.charAt(i), 10)) {
                return false;
            }
        }
        return true;
    }
}