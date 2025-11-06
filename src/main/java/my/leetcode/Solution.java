package my.leetcode;

public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] solution = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0, count = 0;

                for (int di = -1; di < 2; di++) {
                    for (int dj = -1; dj < 2; dj++) {
                        int curri = i + di, currj = j + dj;
                        if (curri > -1 && curri < m && currj > -1 && currj < n) {
                            sum += img[curri][currj];
                            count++;
                        }
                    }
                }
                solution[i][j] = (int) Math.floor(sum / count);

            }

        }
        return solution;
    }
}