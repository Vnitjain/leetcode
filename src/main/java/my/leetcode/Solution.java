package my.leetcode;

public class Solution {
    public boolean judgeCircle(String moves) {
        int[] freq = new int[2];

        for (char move : moves.toCharArray()) {
            if (move == 'U')
                freq[0]++;
            else if (move == 'D')
                freq[0]--;
            else if (move == 'L')
                freq[1]++;
            else
                freq[1]--;
        }
        return freq[0] == 0 && freq[1] == 0;
    }
}
