package problems;

import utils.ListNode;

public class p83 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1)));

        ListNode.print(head);
        ListNode newHead = new p83().deleteDuplicates(head);
        ListNode.print(newHead);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode first = head;

        while (first != null && first.next != null) {
            if (first.val == first.next.val) {
                first.next = first.next.next;
            } else {
                first = first.next;
            }
        }

        return head;
    }
}
