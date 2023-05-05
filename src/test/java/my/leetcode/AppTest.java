package my.leetcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        startTimer();
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        s.moveZeroes(nums);
        assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, nums);
        stopTimer();

        startTimer();
        nums = new int[] { 0 };
        s.moveZeroes(nums);
        assertArrayEquals(new int[] { 0 }, nums);
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
