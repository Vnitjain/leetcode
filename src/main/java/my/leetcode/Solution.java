package my.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> uNums1 = new HashSet<>();
        Set<Integer> uNums2 = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<>();
        for (int num : nums1) {
            uNums1.add(num);
        }
        for (int num : nums2) {
            uNums2.add(num);
        }
        Set<Integer> tempList = new HashSet<>();
        for (Integer num : nums1) {
            if (!uNums2.contains(num)) {
                tempList.add(num);
            }
        }
        resultList.add(new ArrayList<>(tempList));
        tempList = new HashSet<>();
        for (Integer num : nums2) {
            if (!uNums1.contains(num)) {
                tempList.add(num);
            }
        }
        resultList.add(new ArrayList<>(tempList));
        return resultList;
    }
}
