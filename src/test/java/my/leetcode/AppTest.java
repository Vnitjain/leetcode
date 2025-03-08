package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        startTimer();
        assertEquals(true, s.closeStrings("abc", "bca"));
        stopTimer();
    }

    @Test
    public void testExample2() {
        startTimer();
        assertEquals(false, s.closeStrings("a", "aa"));
        stopTimer();
    }

    @Test
    public void testExample3() {
        startTimer();
        assertEquals(true, s.closeStrings("cabbba", "abbccc"));
        stopTimer();
    }

    @Test
    public void testExample4() {
        startTimer();
        assertEquals(false, s.closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff"));
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
