package my.leetcode;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equalsIgnoreCase(str2+str1))
            return "";
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }
    private int gcd(int len1,int len2){
        for(int i=Math.min(len2,len1);i>0;i--){
            if(len1%i==0&&len2%i==0)
                return i;
        }
        return 1;
    }
}
