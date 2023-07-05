package my.leetcode;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return reduceString(s).equalsIgnoreCase(reduceString(t));
    }

    private String reduceString(String string) {
        int pointer = 0, length = string.length();
        while (pointer < length) {
            if (string.charAt(pointer) == '#') {
                string = pointer == 0 ? string.substring(pointer + 1, length)
                        : string.substring(0, pointer - 1) + string.substring(pointer-- + 1, length);
                length = string.length();
            } else {
                pointer++;
            }
        }
        return string;
    }
}