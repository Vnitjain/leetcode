package my.leetcode;

public class Solution {
public String sortString(String s) {
        StringBuilder result = new StringBuilder();
        int[] frequency = new int[26];
        int length = s.length();
        for (char c : s.toCharArray()) {
           frequency[(int)c - 97]++; 
        }
        while (length>0) {
            for (int i = 0; i < 26; i++) {
                if(frequency[i]!=0){
                    frequency[i]--;
                    result.append((char)(i+97));
                    length--;
                }
            }
            for (int i = 25; i > -1; i--) {
                if(frequency[i]!=0){
                    frequency[i]--;
                    result.append((char)(i+97));
                    length--;
                }
            }
        }
        return result.toString();
    }
}
