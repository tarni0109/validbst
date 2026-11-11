/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public ListNode deleteMiddle(ListNode head) {

ListNode temp=head;
 if(head == null || head.next == null) return null;
int count=0;
while(temp!=null){
    temp=temp.next;
    count++;
}
int n=0;


    n=count/2;

temp=head;
while(n-1!=0){
    temp=temp.next;
    n--;
}
temp.next=temp.next.next;
return head;
    }
}