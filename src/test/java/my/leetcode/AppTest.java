package my.leetcode;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {

    }

    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " millisecons");
    }
}
