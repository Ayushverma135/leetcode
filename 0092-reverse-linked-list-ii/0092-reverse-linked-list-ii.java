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
    public ListNode Reverse(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode cur=head;
        ListNode prev=null;
        int c=1;
        while(c!=left){
            prev=cur;
            cur=cur.next;
            c++;
        }
        ListNode start =cur;
        while(c!=right){
            cur=cur.next;
            c++;
        }
        ListNode temp=cur.next;
        cur.next=null;
        ListNode newhead=Reverse(start);
        if(prev!=null){
            prev.next=newhead;
        }
        cur=newhead;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=temp;
        if(prev==null){
            return newhead;
        }
        else{
            return head;
        }
    }
}