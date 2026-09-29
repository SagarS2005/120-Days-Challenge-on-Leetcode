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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        if (size == n) {
            return head.next; // Returns the second node as the new head
        }
        int i = 0;
        ListNode prev = null;
        ListNode current = head;
        while(i < size - n){
            prev = current;
            current= current.next;
            i++; 
        }
        prev.next = current.next;
        return head;
    }
}