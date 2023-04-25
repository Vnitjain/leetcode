package my.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();

    @Test
    public void testCheckZeroOnes() {
        assertTrue(s.checkZeroOnes("1101"));
        assertFalse(s.checkZeroOnes("111000"));
        assertFalse(s.checkZeroOnes("110100010"));
    }

    @Test
    public void failedTestCheckZeroOnes() {
        assertFalse(s.checkZeroOnes("110100010"));
    }

    @Test
    public void tp() {
        System.out.println((int) '0');
    }
}
