package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        startTimer();
        assertEquals(1, s.isWinner(new int[] { 4, 10, 7, 9 }, new int[] { 6, 5, 2, 3 }));
        stopTimer();

        startTimer();
        assertEquals(2, s.isWinner(new int[] { 3, 5, 7, 6 }, new int[] { 8, 10, 10, 2 }));
        stopTimer();

        startTimer();
        assertEquals(0, s.isWinner(new int[] { 2, 3 }, new int[] { 4, 1 }));
        stopTimer();

    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
