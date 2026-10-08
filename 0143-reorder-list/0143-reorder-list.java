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
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode secondNodeHead = mid.next;
        mid.next = null;
        ListNode leftNode = head;
        ListNode rightNode = reverse(secondNodeHead);

        
        ListNode nextLeft, nextRight;
            while (leftNode!=null && rightNode != null) {
                nextLeft = leftNode.next;     // storing next node of first node
                leftNode.next=rightNode;    
                nextRight=rightNode.next;   // storing next node of right node
                rightNode.next=nextLeft;

                // Updating leftNode and RightNode
                leftNode=nextLeft;
                rightNode=nextRight;
            }
        head = leftNode;
    }

    private ListNode findMid(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode currentNode){
        ListNode prev = null;
        ListNode nextNode = null;

        while(currentNode !=null){
            nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }

        return prev;          // prev will be the head of secondNode
    }
}