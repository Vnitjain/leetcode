package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolutionExample1() {
        int[] nums = { 1, 2, 3, 4 };
        int k = 5;
        int expected = 2;
        int actual = s.maxOperations(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionExample2() {
        int[] nums = { 3, 1, 3, 4, 3 };
        int k = 6;
        int expected = 1;
        int actual = s.maxOperations(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionEmptyArray() {
        int[] nums = {};
        int k = 5;
        int expected = 0;
        int actual = s.maxOperations(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionNoPairs() {
        int[] nums = { 1, 2, 3 };
        int k = 10;
        int expected = 0;
        int actual = s.maxOperations(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolution() {
        int[] nums = { 3, 5, 1, 5 };
        int k = 2;
        int expected = 0;
        int actual = s.maxOperations(nums, k);
        assertEquals(expected, actual);

    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}