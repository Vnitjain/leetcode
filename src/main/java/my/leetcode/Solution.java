package my.leetcode;

public class Solution {
    public int countDigits(int num) {
        int number = num;

        int count = 0;
        while(number!=0){
            if(num%(number%10)==0)
                count++;
            number/=10;
        }
        return count;
    }
}
