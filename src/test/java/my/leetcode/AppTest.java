package my.leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void isPerfectSquare93025Test() {
        Solution s = new Solution();
        assertTrue(s.isPerfectSquare(93025));
    }

    @Test
    public void isPerfectSquareLoopTest() {
        Solution s = new Solution();
        for (int i = 0; i < 1024; i++) {
            assertTrue(s.isPerfectSquare(i * i));
        }
    }
}