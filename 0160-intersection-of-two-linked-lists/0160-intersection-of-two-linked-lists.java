public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode n1 = headA;
        ListNode n2 = headB;

        // Loop runs until n1 and n2 point to the exact same memory location
        while (n1 != n2) {
            // Switch tracks if a pointer hits the end of a list
            n1 = (n1 == null) ? headB : n1.next;
            n2 = (n2 == null) ? headA : n2.next;
        }

        // Returns either the intersection node or null if there is no intersection
        return n1;
    }
}
