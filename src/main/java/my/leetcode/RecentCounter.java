package my.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> requests;

    public RecentCounter() {
        this.requests = new ArrayDeque<>();
    }

    public int ping(int t) {
        requests.add(t);
        while (requests.peek() < t - 3000)
            requests.remove();

        return requests.size();
    }
}
