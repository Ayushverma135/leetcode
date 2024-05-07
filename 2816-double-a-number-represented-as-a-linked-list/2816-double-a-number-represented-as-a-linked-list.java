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
        if(head==null || head.next==null){
            return head;
        }
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
    public ListNode doubleIt(ListNode head) {
        ListNode revHead=reverse(head);
        ListNode newHead=revHead;
        int c=0;
        int temp=0;
        while(newHead!=null){
            temp=newHead.val;
            if(c!=0){
                newHead.val=newHead.val+c;
            }
            c=0;
            int sum=newHead.val+temp;
            newHead.val=sum%10;
            if(sum>=10){
                c=sum/10;
            }
            newHead=newHead.next;
        }
        if(c!=0){
            ListNode node=new ListNode(c);
            newHead=revHead;
            while(newHead.next!=null){
                newHead=newHead.next;
            }
            newHead.next=node;
        }
        return reverse(revHead);
    }
}