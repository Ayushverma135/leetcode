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
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            ListNode nextNode = current.next;
            ListNode gcdNode = new ListNode(gcd(current.val, nextNode.val));
            current.next = gcdNode;
            gcdNode.next = nextNode;
            current = nextNode;
        }

        return head;
    }
}