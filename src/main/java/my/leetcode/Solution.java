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
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode pointer = head;
        ListNode prev = null;
        while (pointer.next != null) {
            ListNode next = pointer.next;
            pointer.next = prev;
            prev = pointer;
            pointer = next;
        }
        pointer.next = prev;
        return pointer;
    }
}