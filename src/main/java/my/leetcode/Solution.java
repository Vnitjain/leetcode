package my.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int stackTop = -1;
        for (int i = 0; i < asteroids.length; i++) {
            while (stackTop >= 0 && asteroids[i] < 0 && stack[stackTop] > 0) {
                int diff = asteroids[i] + stack[stackTop];
                if (diff > 0)
                    asteroids[i] = 0;
                else if (diff == 0) {
                    asteroids[i] = 0;
                    stackTop--;
                } else
                    stackTop--;
            }
            if (asteroids[i] != 0)
                stack[++stackTop] = asteroids[i];
        }
        if (stackTop < 0)
            return new int[0];
        else
            return Arrays.copyOfRange(stack, 0, stackTop + 1);
    }
}