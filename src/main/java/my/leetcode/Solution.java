package my.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> count = new HashMap<>();
        int matches = 0;
        for (int i = 0; i < grid.length; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                rowList.add(grid[i][j]);
            }
            count.put(rowList, count.getOrDefault(rowList, 0) + 1);
        }
        for (int i = 0; i < grid.length; i++) {
            List<Integer> columnList = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                columnList.add(grid[j][i]);
            }
            if (count.containsKey(columnList)) {
                matches += count.getOrDefault(columnList, 0);
            }
        }
        return matches;
    }
}
