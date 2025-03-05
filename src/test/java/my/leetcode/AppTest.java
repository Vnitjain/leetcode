package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        assertTrue(s.uniqueOccurrences(arr));
    }

    @Test
    public void testExample2() {
        int[] arr = { 1, 2 };
        assertFalse(s.uniqueOccurrences(arr));
    }

    @Test
    public void testExample3() {
        int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        assertTrue(s.uniqueOccurrences(arr));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
