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
    public ListNode findMid(ListNode head){
        ListNode  slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;    // this will be the mid point
    }

    public ListNode merge(ListNode left, ListNode right){
        ListNode mergedList= new ListNode(-1);
        ListNode temp  = mergedList;
        
        while(left != null && right != null){
            if(left.val <= right.val){
                temp.next = left;
                left = left.next;
            }
            else{
                temp.next = right;
                right = right.next;
            }

            temp = temp.next;
        }
        if(left != null){
            temp.next = left;
        }
        else{
            temp.next = right;
        }
        return mergedList.next;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = findMid(head);
        
        ListNode  rightNode = mid.next;
        mid.next = null;

        ListNode newLeftNode = sortList(head);
        ListNode newRightNode = sortList(rightNode);
        
        return merge(newLeftNode, newRightNode);
    }

}