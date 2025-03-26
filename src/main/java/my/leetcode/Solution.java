package my.leetcode;

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
    public ListNode deleteMiddle(ListNode head) {
        ListNode p = head;
        int length = 0;
        while (p != null) {
            p = p.next;
            length++;
        }
        if (length < 2) {
            return null;
        }
        int mid = length / 2;
        p = head;
        ListNode prev = p;
        for (int i = 0; i < mid; i++) {
            prev = p;
            p = p.next;
        }
        prev.next = p.next;
        return head;
    }
}
