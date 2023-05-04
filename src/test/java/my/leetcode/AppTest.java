package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        startTimer();
        assertEquals(0, s.strStr("sadbutsad", "sad"));
        stopTimer();

        startTimer();
        assertEquals(-1, s.strStr("leetcode", "leeto"));
        stopTimer();

        startTimer();
        assertEquals(2, s.strStr("leetcode", "etc"));
        stopTimer();

        startTimer();
        assertEquals(-1, s.strStr("mississippi", "issipi"));
        stopTimer();

        startTimer();
        assertEquals(0, s.strStr("a", "a"));
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
