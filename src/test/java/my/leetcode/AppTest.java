package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        int[] nums = { 1, 4, 3, 2 };
        int expected = 4;
        assertEquals(expected, s.arrayPairSum(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = { 6, 2, 6, 5, 1, 2 };
        int expected = 9;
        assertEquals(expected, s.arrayPairSum(nums));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
