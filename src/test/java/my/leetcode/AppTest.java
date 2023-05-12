package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        assertEquals(3, s.romanToInt("III"));
        assertEquals(58, s.romanToInt("LVIII"));
        assertEquals(1994, s.romanToInt("MCMXCIV"));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
