package my.leetcode;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return reduceString(s).equals(reduceString(t));
    }

    private Stack<Character> reduceString(String string) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(string.charAt(i));
            }
        }
        return stack;
    }
}