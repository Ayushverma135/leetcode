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
    public int height(ListNode root){
        if(root==null){return 0;}
        int c=0;
        while(root!=null){
            root=root.next;
            c++;
        }
        return c;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int h=height(head);
        if(h==n){return head.next;}
        ListNode temp=head;
        int i=h-n-1;
        while(i>0){
            temp=temp.next;
            i--;
        }
        temp.next=temp.next.next;
        return head;
    }
}