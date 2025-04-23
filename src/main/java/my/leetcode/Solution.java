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
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        ListNode evenStart = head;
        ListNode oddStart = head.next;

        ListNode i = evenStart;
        ListNode j = oddStart;
        while (i.next != null && j.next != null) {

            i.next = i.next.next;
            i = i.next;

            j.next = j.next.next;
            j = j.next;
        }
        i.next = oddStart;
        return evenStart;
    }
}
