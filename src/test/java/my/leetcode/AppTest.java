package my.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();

    @Test
    public void testCases() {
        assertTrue(s.equalFrequency("abcc"));
        assertFalse(s.equalFrequency("aazz"));
    }

    @Test
    public void failedTestCases() {
        assertTrue(s.equalFrequency("bac"));
        assertTrue(s.equalFrequency("ddaccb"));
    }
}
