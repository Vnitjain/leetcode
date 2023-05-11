package my.leetcode;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int pointer = digits.length, remainder = 1;
        while (--pointer >= 0) {
            int sum = digits[pointer] + remainder;
            remainder = sum / 10;
            digits[pointer] = sum % 10;
        }
        if (remainder != 0) {
            int[] newDigits = Arrays.copyOf(digits, digits.length + 1);
            newDigits[0] = remainder;
            return newDigits;
        } else {
            return digits;
        }
    }
}
