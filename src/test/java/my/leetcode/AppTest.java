package my.leetcode;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void shouldAnswerWithTrue() {

    }

    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public void stopTimer() {
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
