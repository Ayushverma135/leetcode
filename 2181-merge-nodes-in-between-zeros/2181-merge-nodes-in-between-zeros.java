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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy =new ListNode(-1);
        ListNode cur=head;
        ListNode temp=dummy;
        int sum=0;
        int f=0;
        while(cur!=null){
            if(cur.val!=0){
                sum+=cur.val;
            }
            if(cur.val==0 && f==0){
                f=1;
                
            }
            else if(cur.val==0 && f==1){
                temp.next=cur;
                temp=temp.next;
                temp.val=sum;
                sum=0;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}