package my.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();

    @Test
    public void testDigitCount() {
        assertTrue(s.digitCount("1210"));
        assertFalse(s.digitCount("030"));
    }
}
