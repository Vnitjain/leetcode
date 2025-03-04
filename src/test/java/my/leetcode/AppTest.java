package my.leetcode;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        startTimer();
        int[] gain = { -5, 1, 5, 0, -7 };
        int expected = 1;
        int actual = s.largestAltitude(gain);
        stopTimer();
        org.junit.Assert.assertEquals(expected, actual);
    }

    @Test
    public void testExample2() {
        startTimer();
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
        int expected = 0;
        int actual = s.largestAltitude(gain);
        stopTimer();
        org.junit.Assert.assertEquals(expected, actual);
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
