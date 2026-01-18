package problems;

import utils.ListNode;

public class p82 {
    public static void main(String[] args) {
        // ListNode head = ListNode.FromArray(new int[] {1, 2, 2});
        ListNode head = ListNode.FromArray(new int[] {1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 6});
        ListNode.print(head);
        ListNode.print(new p82().deleteDuplicates(head));

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode a = null;
        ListNode b = head;

        while (b != null && b.next != null) {

            if (b.val == b.next.val) {
                // do smth
                ListNode ptr = b;
                while (ptr != null && ptr.val == b.val) {
                    ptr = ptr.next;
                }

                if (a == null) {
                    // we are first pos
                    head = ptr;
                    b = head;
                } else {
                    a.next = ptr;
                    b = ptr;
                }
            } else {
                a = b;
                b = b.next;
            }
        }

        return head;
    }
}
