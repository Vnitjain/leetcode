package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution1() {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int expected = 3;
        int actual = s.pivotIndex(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        int[] nums = { 1, 2, 3 };
        int expected = -1;
        int actual = s.pivotIndex(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution3() {
        int[] nums = { 2, 1, -1 };
        int expected = 0;
        int actual = s.pivotIndex(nums);
        assertEquals(expected, actual);
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
