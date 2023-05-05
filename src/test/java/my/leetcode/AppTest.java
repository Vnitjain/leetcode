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
    }

    @Test
    public void tp() {
        // System.out.println(s.doesItRepeatInString("abc", "abcabcabcabc"));
        // System.out.println(s.doesItRepeatInString("ab", "abcabcabcabc"));
        // System.out.println(s.doesItRepeatInString("ab", "aba"));
        // System.out.println(s.doesItRepeatInString("abc", "abcabcabcab"));

    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
