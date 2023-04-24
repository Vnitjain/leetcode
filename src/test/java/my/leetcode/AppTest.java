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
        assertFalse(s.equalFrequency("ddaccb"));
    }

    @Test
    public void testCheckMethod() {
        assertTrue(s.checkIfAllEqual(new int[] { 1, 1, 1, 0 }));
        assertFalse(s.checkIfAllEqual(new int[] { 1, 2, 1, 0 }));
    }
}
