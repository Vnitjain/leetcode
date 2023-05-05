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
        assertTrue(s.repeatedSubstringPattern("abab"));
        stopTimer();

        startTimer();
        assertFalse(s.repeatedSubstringPattern("aba"));
        stopTimer();

        startTimer();
        assertTrue(s.repeatedSubstringPattern("abcabcabcabc"));
        stopTimer();

        startTimer();
        assertFalse(s.repeatedSubstringPattern("abcdabcabcabc"));
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
