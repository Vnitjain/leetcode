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
        assertTrue(s.backspaceCompare("ab#c", "ad#c"));
        stopTimer();
        startTimer();
        assertTrue(s.backspaceCompare("ab##", "c#d#"));
        stopTimer();
        startTimer();
        assertFalse(s.backspaceCompare("a#c", "b"));
        stopTimer();
        startTimer();
        assertTrue(s.backspaceCompare("a##c", "#a#c"));
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
