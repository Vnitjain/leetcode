package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        int[][] grid = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
        int expected = 1;
        int actual = s.equalPairs(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void testExample2() {
        int[][] grid = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };
        int expected = 3;
        int actual = s.equalPairs(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyGrid() {
        int[][] grid = {};
        int expected = 0;
        int actual = s.equalPairs(grid);
        assertEquals(expected, actual);
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
