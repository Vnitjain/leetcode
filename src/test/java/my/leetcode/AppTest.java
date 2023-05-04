package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        assertEquals("apbqcr", s.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", s.mergeAlternately("ab", "pqrs"));
    }

    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public void stopTimer() {
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
