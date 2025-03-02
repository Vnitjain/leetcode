package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testExample1() {
        assertEquals(3, s.maxVowels("abciiidef", 3));
    }

    @Test
    public void testExample2() {
        assertEquals(2, s.maxVowels("aeiou", 2));
    }

    @Test
    public void testExample3() {
        assertEquals(2, s.maxVowels("leetcode", 3));
    }

    @Test
    public void testOneChar() {
        assertEquals(1, s.maxVowels("a", 1));
        assertEquals(0, s.maxVowels("b", 1));
    }

    @Test
    public void testLongString() {
        String longString = "aeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiou";
        assertEquals(5, s.maxVowels(longString, 5));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
