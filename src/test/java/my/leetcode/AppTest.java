package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();

    @Test
    public void testCases() {
        assertEquals(null, 5, s.largestPerimeter(new int[] { 2, 1, 2 }), 0);
        assertEquals(null, 0, s.largestPerimeter(new int[] { 1, 2, 1, 10 }), 0);
    }

    @Test
    public void failedTestCases() {
        assertEquals(null, 8, s.largestPerimeter(new int[] { 3, 6, 2, 3 }), 0);
        assertEquals(null, 5, s.largestPerimeter(new int[] { 2, 1, 2 }), 0);
        assertEquals(null, 10, s.largestPerimeter(new int[] { 3, 2, 3, 4 }), 0);
    }
}
