package my.leetcode;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int pointer = digits.length - 1, remainder = 1;
        int[] newDigits = new int[digits.length];
        while (pointer >= 0) {
            int sum = digits[pointer] + remainder;
            remainder = sum / 10;
            newDigits[pointer--] = sum % 10;
        }
        return remainder != 0 ? new int[] { remainder, newDigits } : newDigits;
    }
}
