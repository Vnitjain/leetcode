package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        assertTrue(s.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void testExample2() {
        assertFalse(s.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void testEmptyS() {
        assertTrue(s.isSubsequence("", "ahbgdc"));
    }

    @Test
    public void testEmptyT() {
        assertFalse(s.isSubsequence("abc", ""));
    }

    @Test
    public void testSameString() {
        assertTrue(s.isSubsequence("abc", "abc"));
    }

    @Test
    public void testLongerS() {
        assertFalse(s.isSubsequence("ahbgdc", "abc"));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }

}
