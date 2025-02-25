package my.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        assertTrue(s.increasingTriplet(new int[] { 1, 2, 3, 4, 5 }));
    }

    @Test
    public void testSolution1() {
        assertFalse(s.increasingTriplet(new int[] { 5, 4, 3, 2, 1 }));
    }

    @Test
    public void testSolution2() {
        assertTrue(s.increasingTriplet(new int[] { 2, 1, 5, 0, 4, 6 }));
    }

    @Test
    public void testSolution3() {
        assertTrue(s.increasingTriplet(new int[] { 20, 100, 10, 12, 5, 13 }));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
