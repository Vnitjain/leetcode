package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    Solution s = new Solution();

    @Test
    public void test1() {
        ListNode head = new ListNode(1,
                new ListNode(3, new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6)))))));
        ListNode expected = new ListNode(1,
                new ListNode(3, new ListNode(4, new ListNode(1, new ListNode(2, new ListNode(6))))));
        ListNode result = s.deleteMiddle(head);
        assertEquals(listToString(expected), listToString(result));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode result = s.deleteMiddle(head);
        assertEquals(listToString(expected), listToString(result));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(2, new ListNode(1));
        ListNode expected = new ListNode(2);
        ListNode result = s.deleteMiddle(head);
        assertEquals(listToString(expected), listToString(result));
    }

    private String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder("[");
        while (head != null) {
            sb.append(head.val);
            if (head.next != null)
                sb.append(",");
            head = head.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
