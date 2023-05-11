package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        startTimer();
        assertEquals(1, s.arraySign(new int[] { -1, -2, -3, -4, 3, 2, 1 }));
        stopTimer();

        startTimer();
        assertEquals(0, s.arraySign(new int[] { 1, 5, 0, 2, -3 }));
        stopTimer();

        startTimer();
        assertEquals(-1, s.arraySign(new int[] { -1, 1, -1, 1, -1 }));
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
