package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    Solution s = new Solution();

    @Test
    public void solutionExampleTestCases() {
        assertEquals(null, 1, s.removePalindromeSub("ababa"), 0);
        assertEquals(null, 2, s.removePalindromeSub("abb"), 0);
        assertEquals(null, 2, s.removePalindromeSub("baabb"), 0);

    }

    @Test
    public void wrongTestCases() {
        assertEquals(null, 2, s.removePalindromeSub("bbaabaaa"), 0);
    }
}
