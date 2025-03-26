package my.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> R = new LinkedList<>(), D = new LinkedList<>();
        int length = senate.length();
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R')
                R.add(i);
            else
                D.add(i);
        }
        while (R.size() != 0 && D.size() != 0) {
            if (R.peek() > D.peek()) {
                D.add(D.remove() + length);
                R.remove();
            } else {
                R.add(R.remove() + length);
                D.remove();
            }
        }
        return R.size() == 0 ? "Dire" : "Radiant";
    }
}