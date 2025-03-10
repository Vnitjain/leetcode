package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        startTimer();
        String input = "leet**cod*e";
        String expected = "lecoe";
        String actual = s.removeStars(input);
        assertEquals(expected, actual);
        stopTimer();
    }

    @Test
    public void testExample2() {
        startTimer();
        String input = "erase*****";
        String expected = "";
        String actual = s.removeStars(input);
        assertEquals(expected, actual);
        stopTimer();
    }

    @Test
    public void testEmptyInput() {
        startTimer();
        String input = "";
        String expected = "";
        String actual = s.removeStars(input);
        assertEquals(expected, actual);
        stopTimer();
    }

    @Test
    public void testNoStars() {
        startTimer();
        String input = "leetcode";
        String expected = "leetcode";
        String actual = s.removeStars(input);
        assertEquals(expected, actual);
        stopTimer();
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }

}
