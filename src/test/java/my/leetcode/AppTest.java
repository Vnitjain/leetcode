package my.leetcode;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        startTimer();
        s.findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
