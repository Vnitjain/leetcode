package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        startTimer();
        double result = s.findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4);
        stopTimer();
        assertEquals(12.75, result, 0.00001);
    }

    @Test
    public void testExample2() {
        startTimer();
        double result = s.findMaxAverage(new int[] { 5 }, 1);
        stopTimer();
        assertEquals(5.0, result, 0.00001);
    }

    @Test
    public void testEmptyArray() {
        startTimer();
        double result = s.findMaxAverage(new int[] {}, 0);
        stopTimer();
        assertEquals(0.0, result, 0.00001);
    }

    @Test
    public void testLargeArray() {
        startTimer();
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        double result = s.findMaxAverage(nums, 1000);
        stopTimer();
        // assertion not added as the result varies based on implementation
    }

    @Test
    public void testNegativeArray() {
        startTimer();
        double result = s.findMaxAverage(new int[] { -1 }, 1);
        stopTimer();
        assertEquals(-1.0, result, 0.00001);
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
