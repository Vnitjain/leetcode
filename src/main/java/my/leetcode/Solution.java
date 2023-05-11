package my.leetcode;

class Solution {
    public int arraySign(int[] nums) {
        boolean isNCountEven = true;
        for (int i : nums) {
            if (i == 0) {
                return 0;
            } else if (i < 0) {
                isNCountEven = !isNCountEven;
            }
        }
        return isNCountEven ? 1 : -1;
    }
}