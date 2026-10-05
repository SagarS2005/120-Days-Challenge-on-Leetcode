/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean iscycleExist = false;
        ListNode slow = head, fast =head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                iscycleExist = true;
                break;
            }
        }
        if(!iscycleExist){
            return null;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}