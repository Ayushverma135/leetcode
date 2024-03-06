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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode prev=reverse(head);
        ListNode cur=prev;
        while(cur!=null){
            ListNode temp2=cur;
            while(temp2.next!=null && temp2.next.val<cur.val){
                temp2=temp2.next;
            }
            cur.next=temp2.next;
            cur=cur.next;
        }
        return reverse(prev);
    }
}