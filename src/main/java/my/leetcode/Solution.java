package my.leetcode;

import java.util.Arrays;

class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int prev = skill[0] + skill[skill.length - 1];
        long finalLong = skill[0] * skill[skill.length - 1];
        for (int i = 1; i < skill.length / 2; i++) {
            if (skill[i] + skill[skill.length - 1 - i] != prev)
                return -1;
            finalLong += skill[i] * skill[skill.length - 1 - i];
        }
        return finalLong;
    }
}
