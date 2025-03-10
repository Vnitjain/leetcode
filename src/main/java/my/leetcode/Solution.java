package my.leetcode;

import java.util.Stack;

public class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character character : s.toCharArray())
            if (character >= 'a' && character <= 'z')
                stack.push(character);
            else
                stack.pop();
        String finalString = "";
        for (Character character : stack)
            finalString += String.valueOf(character);

        return finalString;
    }
}
