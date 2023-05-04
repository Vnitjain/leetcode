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
        assertTrue(s.isAnagram("anagram", "nagaram"));
        stopTimer();

        startTimer();
        assertFalse(s.isAnagram("rat", "car"));
        stopTimer();

        startTimer();
        assertFalse(s.isAnagram("a", "ab"));
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
