package my.leetcode;

import java.util.Arrays;

public class Solution {
    public String reverseWords(String s) {
        String[] strArr = Arrays.stream(s.strip().split(" ")).filter((c) -> c != "").toArray(String[]::new);
        int i = 0, j = strArr.length - 1;

        while (i < j) {
            String temp = strArr[i];
            strArr[i++] = strArr[j];
            strArr[j--] = temp;
        }
        return String.join(" ", strArr);
    }
}
