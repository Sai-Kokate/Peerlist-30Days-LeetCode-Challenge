**
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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = new ListNode();

        while(curr!=null){
            // save the next in a variable to resuse later
            next = curr.next;
            // point the current to its previous
            curr.next=prev;
            // move prev ahead, make prev to curr for next iteration
            prev = curr;
            // update current to next for next iteration
            curr = next;
        }

        head = prev;

        return head;
    }
}