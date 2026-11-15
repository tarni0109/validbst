public ListNode DeleteTail(ListNode head) {
    if (head == null || head.next == null) {
        return null;
    }

    ListNode temp = head;

    while (temp.next.next != null) {
        temp = temp.next;
    }

    temp.next = null;

    return head;
}