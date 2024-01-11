package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        Solution s = new Solution();
        assertEquals(42, s.myAtoi("42"));
        assertEquals(-42, s.myAtoi(" -42"));
        assertEquals(4193, s.myAtoi("4193 with words"));
        assertEquals(2147483647, s.myAtoi("9223372036854775808"));
        assertEquals(2147483647, s.myAtoi("9223372036854775808"));
        assertEquals(0, s.myAtoi("words and 987"));
        assertEquals(2147483647, s.myAtoi("9223372036854775808"));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
