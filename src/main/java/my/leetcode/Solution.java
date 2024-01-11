package my.leetcode;

class Solution {
    public int myAtoi(String s) {
        s.trim();
        if (s.isEmpty())
            return 0;
        int number = 0;
        int numberLength = 0;

        boolean isPositive = s.charAt(0) != '-';

        for (int i = 0; i < s.length(); i++) {
            number = number * 10 + Character.getNumericValue(s.charAt(i));
            numberLength++;
            if (numberLength > 9 && Integer.MAX_VALUE % 10 < s.charAt(i))
                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
}