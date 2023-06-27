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
    public int length(ListNode head){
        int n=0;
        while(head!=null){
            n++;
            head=head.next;
        }
        return n;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n=length(head);
        if(length(head)<=k){
            ListNode res[]=new ListNode[k];
            int i=0;
            while(head!=null){
                ListNode temp=head;
                res[i]=temp;
                head=head.next;
                temp.next=null;
                i++;
            }
            return res;
        }
        else{
            ListNode res[]=new ListNode[k];
            ListNode ptr=head;
            int i=0;
            ListNode temp=head;
            int c=n%k;
            
            
            while(c>0){
                res[i++]=temp;
                for(int j=0;j<n/k;j++){
                    temp=temp.next;
                }
                ptr=temp.next;
                temp.next=null;
                temp=ptr;
                c--;
            }
            while(temp!=null){
                res[i++]=temp;
                for(int j=0;j<n/k-1;j++){
                    temp=temp.next;
                }
                ptr=temp.next;
                temp.next=null;
                temp=ptr;
            }
            return res;
        }


    }
}