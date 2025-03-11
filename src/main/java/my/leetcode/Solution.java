package my.leetcode;

public class Solution {
    public String removeStars(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (Character character : s.toCharArray())
            if (character == '*')
                --top;
            else
                stack[++top] = character;
        String finalString = "";
        while (top > -1) {
            finalString = String.valueOf(stack[top--]) + finalString;
        }
        return finalString;
    }
}
