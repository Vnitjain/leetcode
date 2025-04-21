package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void test() {
        // Example 1
        assertEquals(6, s.maximumProduct(new int[] { 1, 2, 3 }));

        // Example 2
        assertEquals(24, s.maximumProduct(new int[] { 1, 2, 3, 4 }));

        // Example 3
        assertEquals(-6, s.maximumProduct(new int[] { -1, -2, -3 }));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
