package my.leetcode;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(String currStr:sentences){
            max = Math.max(max,countWords(currStr));
        }
        return max;
    }

    private int countWords(String str){
        int count = 0;
        for (char c:str.toCharArray()){
            if(c==' ')
                count++;
        }
        return  count+1;
    }
}
