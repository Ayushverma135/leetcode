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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max=Integer.MIN_VALUE;
        for (int i:nums){
            max=Math.max(max,i);
        }
        int arr[]=new int[max+1];
        for(int i:nums){
            arr[i]++;
        }
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val <= max && arr[cur.val]!=0){
                if(head.val==cur.val){
                    head=head.next;
                }
                else{
                    prev.next=cur.next;
                    cur=cur.next;
                    continue;
                }
            }
            prev=cur;
            cur=cur.next;
        }
        return head;
    }
}