package my.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();

    @Test
    public void testCases() {
        assertTrue(s.detectCapitalUse("USA"));
        assertFalse(s.detectCapitalUse("FlaG"));
    }

    @Test
    public void testIsCapitalMethod() {
        assertTrue(s.isCapital('Z'));
        assertFalse(s.isCapital('z'));
        assertTrue(s.isCapital('A'));
        assertFalse(s.isCapital('a'));
    }
}
