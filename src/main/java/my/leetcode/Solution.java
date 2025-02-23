package my.leetcode;

public class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] strArr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && vowels.indexOf(strArr[i]) == -1)
                i++;
            while (i < j && vowels.indexOf(strArr[j]) == -1)
                j--;

            char temp = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = temp;
            i++;
            j--;
        }
        return new String(strArr);
    }
}