package my.leetcode;

class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int stringLength = str.length();
        for (int i = stringLength / 2; i >= 1; i--) {
            if (stringLength % i == 0) {
                int count = stringLength / i;
                String subString = str.substring(0, i);
                String tempString = "";
                for (int j = 0; j < count; j++)
                    tempString += subString;
                if (tempString.equals(str))
                    return true;
            }
        }
        return false;
    }
}