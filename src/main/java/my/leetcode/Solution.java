package my.leetcode;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode pointer = head;
        int length = 0;
        while (pointer != null) {
            length++;
            pointer = pointer.next;
        }
        pointer = head;
        for (int i = 0; i < length / 2; i++) {
            stack.push(pointer.val);
            pointer = pointer.next;
        }
        int max = Integer.MIN_VALUE;
        while (pointer != null) {
            max = Math.max(max, pointer.val + stack.pop());
            pointer = pointer.next;
        }
        return max;
    }
}