package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        startTimer();
        assertEquals('e', s.findTheDifference("abcd", "abcde"));
        stopTimer();

        startTimer();
        assertEquals('y', s.findTheDifference("", "y"));
        stopTimer();
    }

    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
