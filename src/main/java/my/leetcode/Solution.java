package my.leetcode;

public class Solution {
    public String firstPalindrome(String[] words) {
        for (String str:words){
            if(isPalindrome(str))
                return str;
        }
        return "";
    }

    private boolean isPalindrome(String str){
        int i=0;
        while(i<str.length()/2){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
            i++;
        }
        return true;
    }
}
