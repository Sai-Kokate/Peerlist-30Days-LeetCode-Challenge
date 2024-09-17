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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        // slow and fast pointer
        ListNode slow = head; ListNode fast = head;

        // incremenet fast by two and lsow by one, by the fast reaches end, slow will reach at center
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}