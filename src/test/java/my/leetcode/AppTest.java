package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        Solution s = new Solution();
        startTimer();
        assertEquals(49, s.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
        stopTimer();

        startTimer();
        assertEquals(0, s.maxArea(new int[] { 1 }));
        stopTimer();

        startTimer();
        assertEquals(1, s.maxArea(new int[] { 1, 1 }));
        stopTimer();

        startTimer();
        assertEquals(2, s.maxArea(new int[] { 1, 2, 1 }));
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
