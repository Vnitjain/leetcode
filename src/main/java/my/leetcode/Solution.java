package my.leetcode;

class Solution {
    public boolean checkZeroOnes(String s) {
        int[] max = new int[2], active = new int[] { s.charAt(0) - 48, 1 };
        for (int i = 1; i < s.length(); i++) {
            int currentInt = s.charAt(i) - 48;
            if (currentInt == active[0]) {
                ++active[1];
            } else {
                if (max[active[0]] < active[1]) {
                    max[active[0]] = active[1];
                }
                active[0] = currentInt;
                active[1] = 1;
            }
        }
        if (active[1] > max[active[0]]) {
            max[active[0]] = active[1];
        }
        return max[1] > max[0];
    }
}