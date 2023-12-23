package my.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        Solution s = new Solution();
        assertArrayEquals(new int[] { 2, 4 }, s.findErrorNums(new int[] { 1, 2, 3, 2 }));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
