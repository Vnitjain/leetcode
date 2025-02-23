package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        Solution s = new Solution();
        assertEquals("blue is sky the", s.reverseWords("the sky is blue"));
        assertEquals("world hello", s.reverseWords(" hello world "));
        assertEquals("example good a", s.reverseWords("a good   example"));

    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
