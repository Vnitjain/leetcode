package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void test1() {
        startTimer();
        String result = s.predictPartyVictory("RD");
        assertEquals("Radiant", result);
        stopTimer();
    }

    @Test
    public void test2() {
        startTimer();
        String result = s.predictPartyVictory("RDD");
        assertEquals("Dire", result);
        stopTimer();
    }

    @Test
    public void test3() {
        startTimer();
        String result = s.predictPartyVictory("RDDRDRDRRDD");
        assertEquals("Dire", result);
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
