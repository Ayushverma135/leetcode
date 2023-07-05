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
    ListNode reverse(ListNode head){
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode ptr1=reverse(l1);
        ListNode ptr2=reverse(l2);
        ListNode arr=null;
        int c=0;
        while(ptr1!=null || ptr2!=null){
            int tot=0;
            if(ptr1!=null){
                tot+=ptr1.val;
                ptr1=ptr1.next;
            }
            if(ptr2!=null){
                tot+=ptr2.val;
                ptr2=ptr2.next;
            }
            tot+=c;
            ListNode temp=new ListNode(tot%10);
            c=tot/10;
            temp.next=arr;
            arr=temp;
        }
        if(c==1){
            ListNode tem=new ListNode(1);
            tem.next=arr;
            arr=tem;
        }
        return arr;
    }
}