package my.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int length = strs.length;
        String[] sortedStringsArray = new String[length];
        List<List<String>> finalList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            sortedStringsArray[i] = sortCharacters(strs[i]);
        }

        boolean[] visited = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                List<String> tempList = new ArrayList<>();
                tempList.add(strs[i]);
                visited[i] = true;
                for (int j = i + 1; j < length; j++) {
                    if (!visited[j] && sortedStringsArray[i].equalsIgnoreCase(sortedStringsArray[j])) {
                        tempList.add(strs[j]);
                        visited[j] = true;
                    }
                }
                finalList.add(tempList);
            }
        }
        return finalList;
    }

    private String sortCharacters(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}