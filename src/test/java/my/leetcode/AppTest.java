package my.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution() {
        startTimer();
        assertEquals('e', s.findTheDifference("abcd", "abcde"));
        stopTimer();

        startTimer();
        assertEquals('y', s.findTheDifference("", "y"));
        stopTimer();
    }

    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }

    @Test
    public void tp() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        System.out.println("a: " + a + ", b: " + b);
        a ^= b;
        System.out.println("a: " + a + ", b: " + b);
        b ^= a;
        System.out.println("a: " + a + ", b: " + b);
        a ^= b;
        System.out.println("a: " + a + ", b: " + b);
    }
}
