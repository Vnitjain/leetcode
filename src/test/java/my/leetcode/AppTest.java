package my.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        // startTimer();
        // assertArrayEquals(new int[] { 1, 2, 4 }, s.plusOne(new int[] { 1, 2, 3 }));
        // stopTimer();

        // startTimer();
        // assertArrayEquals(new int[] { 4, 3, 2, 2 }, s.plusOne(new int[] { 4, 3, 2, 1
        // }));
        // stopTimer();

        // startTimer();
        // assertArrayEquals(new int[] { 1, 0 }, s.plusOne(new int[] { 9 }));
        // stopTimer();

        startTimer();
        assertArrayEquals(new int[] { 1, 0, 0, 0 }, s.plusOne(new int[] { 9, 9, 9 }));
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
