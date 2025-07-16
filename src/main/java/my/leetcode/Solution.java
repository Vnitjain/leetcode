package my.leetcode;

public class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] words = new int[26];

        for(char c:sentence.toCharArray()){
            words[(int)c-97]++;
        }

        for (int i:words){
            if(i==0)
                return false;
        }

        return true;
    }
}
