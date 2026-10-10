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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode res = new ListNode(-1);
        // ListNode temp = res;
        // int sum = 0;
        // int carry = 0;
        // while(l1 != null && l2 != null){
        //     sum = l1.val + l2.val + carry;
            
        //         carry = sum / 10;
        //         sum = sum % 10;

        //     temp.next = new ListNode(sum);
        //     temp = temp.next;
        //     l1 = l1.next;
        //     l2 = l2.next;
        // }

        // while(l1 != null){
        //     sum = carry + l1.val;
        //         carry = sum / 10;
        //         sum = sum % 10;
        //     temp.next = new ListNode(sum);
        //     temp = temp.next;
        //     l1 = l1.next;
        // }
        // while(l2 != null){
        //     sum = carry + l2.val;
        //     carry = sum / 10;
        //     sum = sum % 10;
        //     temp.next = new ListNode(sum);
        //     temp = temp.next;
            
        //     l2 = l2.next;
        // }
        // if(carry > 0){
        //     temp.next = new ListNode(carry);
        // }

        // return res.next;

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;
            if(l1 != null) sum += l1.val;
            if(l2 != null) sum += l2.val;
            sum += carry;

            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(digit);
            curr.next = newNode;
            curr = curr.next;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }   

        return dummy.next;     

    }
}