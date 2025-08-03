package my.leetcode;

public class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < length /2; i++) {
            int right = length - 1 - i;
            if(s[i]!=s[right]){
                char temp = s[i];
                s[i] = s[right];
                s[right] = temp;
            }
        }
    }
}
