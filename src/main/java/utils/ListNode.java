package utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode FromArray(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode ptr = head;
        for (int i = 1; i < arr.length; i++) {
            ptr.next = new ListNode(arr[i]);
            ptr = ptr.next;
        }

        return head;
    }

    public static void print(ListNode head) {
        System.out.print("[ ");
        while (head != null) {
            System.out.printf("%d ", head.val);
            head = head.next;
        }
        System.out.println("]");
    }

}
