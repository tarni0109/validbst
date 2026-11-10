/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode deleteHead(ListNode head) {
        // Your code goes here
        if (head == null || head.next == null)
            return null;
        ListNode temp=head;
        temp=temp.next;
        temp.prev=null;
        return temp;

    }
}
