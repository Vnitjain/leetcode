package my.leetcode;

import org.junit.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AppTest {
    Solution s = new Solution();
    long startTime;

    @Test
    public void testSolution1() {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(4, 6));
        assertEquals(expected, s.findDifference(nums1, nums2));
    }

    @Test
    public void testSolution2() {
        int[] nums1 = { 1, 2, 3, 3 };
        int[] nums2 = { 1, 1, 2, 2 };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList());
        assertEquals(expected, s.findDifference(nums1, nums2));
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
    }

    private void stopTimer() {
        System.out.println("Code Executed in : " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
