package my.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AppTest {

    Solution s = new Solution();
    long startTime;

    @Test
    public void test() {
        int[][] input = {
            { 100, 200, 100 },
            { 200, 50, 200 },
            { 100, 200, 100 },
        };
        int[][] output = {
            { 137, 141, 137 },
            { 141, 138, 141 },
            { 137, 141, 137 },
        };
        assertArrayEquals(output, s.imageSmoother(input));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println(
            "Code Executed in : " +
                (System.currentTimeMillis() - startTime) +
                " milliseconds"
        );
    }
}
