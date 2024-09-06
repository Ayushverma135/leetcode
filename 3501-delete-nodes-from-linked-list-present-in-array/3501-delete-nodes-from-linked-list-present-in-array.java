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
        HashSet<Integer> set=new HashSet<>();
        for (int i:nums){
            set.add(i);
        }
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            if(set.contains(cur.val)){
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