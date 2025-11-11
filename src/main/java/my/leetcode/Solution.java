package my.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> mem = new HashMap<>();

    public int fib(int n) {
        mem.put(0, 0);
        mem.put(1, 1);
        return fibonacci(n);
    }

    private int fibonacci(int n) {
        if (mem.containsKey(n))
            return mem.get(n);
        mem.put(n, fib(n - 1) + fib(n - 2));
        return mem.get(n);
    }
}