package my.leetcode;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void shouldAnswerWithTrue() {

    }

    @Test
    public void tp() {
        startTimer();
        // s.findSubsequences(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
        // 15 });
        s.findSubsequences(new int[] { 4, 6, 7, 7 });
        // s.findSubsequences(new int[] { 1, 2, 3 });
        // s.traverse(0, new int[] { 1, 2, 3 });
        stopTimer();
    }

    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public void stopTimer() {
        System.out.println(System.currentTimeMillis() - startTime);
    }
    /*
     * 
     * Input: nums = [4,6,7,7]
     * Output: [[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]
     */
}
