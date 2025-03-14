package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void test1() {
        int[] asteroids = { 5, 10, -5 };
        int[] expected = { 5, 10 };
        startTimer();
        int[] result = s.asteroidCollision(asteroids);
        stopTimer();
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] asteroids = { 8, -8 };
        int[] expected = {};
        startTimer();
        int[] result = s.asteroidCollision(asteroids);
        stopTimer();
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        int[] asteroids = { 10, 2, -5 };
        int[] expected = { 10 };
        startTimer();
        int[] result = s.asteroidCollision(asteroids);
        stopTimer();
        assertArrayEquals(expected, result);
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
