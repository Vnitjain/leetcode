package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        int[] nums = { 1, 1, 0, 1 };
        int expected = 3;
        int actual = s.longestSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testExample2() {
        int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        int expected = 5;
        int actual = s.longestSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testExample3() {
        int[] nums = { 1, 1, 1 };
        int expected = 2;
        int actual = s.longestSubarray(nums);
        assertEquals(expected, actual);
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
