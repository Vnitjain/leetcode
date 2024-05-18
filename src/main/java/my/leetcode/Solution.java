package my.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String currentString = strs[i];
            String sortedString = sortCharacters(currentString);
            List<String> tempList = map.get(sortedString);
            if (tempList == null) {
                List<String> newList = new ArrayList<>();
                newList.add(currentString);
                map.put(sortedString, newList);
            } else {
                tempList.add(currentString);
                map.put(sortedString, tempList);
            }
        }
        List<List<String>> finalList = new ArrayList<>();
        for (String key : map.keySet()) {
            finalList.add(map.get(key));
        }
        return finalList;
    }

    private String sortCharacters(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}