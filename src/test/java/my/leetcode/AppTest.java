package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void test1() {
        String input = "3[a]2[bc]";
        String expected = "aaabcbc";
        String actual = s.decodeString(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String input = "3[a2[c]]";
        String expected = "accaccacc";
        String actual = s.decodeString(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String input = "2[abc]3[cd]ef";
        String expected = "abcabccdcdcdef";
        String actual = s.decodeString(input);
        assertEquals(expected, actual);
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
