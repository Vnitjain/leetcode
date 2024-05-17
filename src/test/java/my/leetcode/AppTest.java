package my.leetcode;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        startTimer();
        s.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
        stopTimer();

        startTimer();
        s.groupAnagrams(new String[] { "" });
        stopTimer();

        startTimer();
        s.groupAnagrams(new String[] { "a" });
        stopTimer();

    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
