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
        ListNode pointer = head;
        int length = 0;
        while (pointer != null) {
            length++;
            pointer = pointer.next;
        }
        int[] stack = new int[length];
        int stackTop = -1;
        pointer = head;
        for (int i = 0; i < length / 2; i++) {
            stack[++stackTop] = pointer.val;
            pointer = pointer.next;
        }
        int max = Integer.MIN_VALUE;
        while (pointer != null) {
            max = Math.max(max, pointer.val + stack[stackTop--]);
            pointer = pointer.next;
        }
        return max;
    }
}