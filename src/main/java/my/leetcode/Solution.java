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
        if (head.next == null)
            return null;

        ListNode slw = head, fst = head.next.next;
        while (fst != null && fst.next != null) {
            fst = fst.next.next;
            slw = slw.next;
        }
        slw.next = slw.next.next;
        return head;
    }
}
