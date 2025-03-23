package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        RecentCounter recentCounter = new RecentCounter();
        assertEquals(1, recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(100));
        assertEquals(3, recentCounter.ping(3001));
        assertEquals(3, recentCounter.ping(3002));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}