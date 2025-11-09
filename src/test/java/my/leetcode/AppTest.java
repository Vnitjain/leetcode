package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void test() {
        assertEquals(2, s.countCompleteDayPairs(new int[] { 12, 12, 30, 24, 24 }));
        assertEquals(3, s.countCompleteDayPairs(new int[] { 72, 48, 24, 3 }));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
