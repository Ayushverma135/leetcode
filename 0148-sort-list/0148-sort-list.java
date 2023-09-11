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
    ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast= head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode merge(ListNode left,ListNode right){
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        ListNode dummy =new ListNode(-1);
        ListNode ptr=dummy;
        while(left!=null && right!=null){
            if(left.val<right.val){
                ptr.next=left;
                left=left.next;
            }
            else{
                ptr.next=right;
                right=right.next;
            }
            ptr=ptr.next;
        }
        while(left!=null){
            ptr.next=left;
            left=left.next;
            ptr=ptr.next;
        }
        while(right!=null){
            ptr.next=right;
            right=right.next;
            ptr=ptr.next;
        }
        return dummy.next;
        
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode Mid =mid(head);
        ListNode left=head;
        ListNode right=Mid.next;
        Mid.next=null;
        left=sortList(left);
        right=sortList(right);
        ListNode result=merge(left,right);
        return result;
    }
}