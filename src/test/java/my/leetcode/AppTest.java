package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        startTimer();
        assertEquals(true, s.canMakeArithmeticProgression(new int[] { 3, 5, 1 }));
        stopTimer();

        startTimer();
        assertEquals(false, s.canMakeArithmeticProgression(new int[] { 1, 2, 4 }));
        stopTimer();
    }

    @Test
    public void tp() {

    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
