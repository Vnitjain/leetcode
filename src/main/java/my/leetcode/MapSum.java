package my.leetcode;

import java.util.HashMap;
import java.util.Map;

class MapSum {
    Map<String, Integer> map;

    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
        return;
    }

    public int sum(String prefix) {
        int sum = 0;
        for (String key : map.keySet()) {
            if (key.startsWith(prefix)) {
                sum += map.get(key);
            }
        }
        return sum;
    }
}