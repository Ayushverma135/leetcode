/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev=null;
        ListNode dummy=new ListNode(-1);
        prev=dummy;
        dummy.next=head;
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        ListNode tail=prev.next;
        for(int i=0;i<right-left;i++){
            ListNode cur=prev.next;
            prev.next=tail.next;
            tail.next=tail.next.next;
            prev.next.next=cur;
        }
        return dummy.next;
    }
}