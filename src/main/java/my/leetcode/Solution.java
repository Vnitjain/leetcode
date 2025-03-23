package my.leetcode;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray())
            if (c == ']') {
                String temp = "";
                while (!stack.isEmpty() && stack.peek() != '[')
                    temp = stack.pop() + temp;
                stack.pop();
                String tempCount = "";
                while (!stack.empty() && Character.isDigit(stack.peek()))
                    tempCount = stack.pop() + tempCount;
                String tempString = "";
                for (int i = 0; i < Integer.valueOf(tempCount); i++)
                    tempString += temp;
                tempString.chars().forEach((i) -> {
                    stack.add((char) i);
                });
            } else
                stack.add(c);
        String finalString = "";
        while (!stack.isEmpty()) {
            finalString = stack.pop() + finalString;
        }
        return finalString;
    }
}
