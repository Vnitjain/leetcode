package my.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        startTimer();
        assertTrue(s.isMonotonic(new int[] { 1, 2, 2, 3 }));
        stopTimer();

        startTimer();
        assertTrue(s.isMonotonic(new int[] { 6, 5, 4, 4 }));
        stopTimer();

        startTimer();
        assertFalse(s.isMonotonic(new int[] { 1, 3, 2 }));
        stopTimer();

    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
