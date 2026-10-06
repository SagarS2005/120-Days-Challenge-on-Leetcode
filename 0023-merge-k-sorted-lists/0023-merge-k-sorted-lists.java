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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode res = null;
        for(int i = 0; i < lists.length; i++){
            if (res == null) {
                res = lists[i]; // The first list becomes our base tracking point
            } else {
                res = mergeNodes(lists[i], res);
            }
        }
        return res;
    }

    private ListNode mergeNodes(ListNode head1, ListNode head2){
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(head2 != null && head1 != null){
            if(head2.val > head1.val){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        while(head1 != null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        return result.next;
    }
}