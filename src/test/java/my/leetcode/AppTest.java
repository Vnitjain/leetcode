package my.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution1() {
        assertArrayEquals(new int[] { 24, 12, 8, 6 }, s.productExceptSelf(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    public void testSolution2() {
        assertArrayEquals(new int[] { 0, 0, 9, 0, 0 }, s.productExceptSelf(new int[] { -1, 1, 0, -3, 3 }));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
