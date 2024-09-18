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
        // same as removing (size - n + 1) node from start
        // calculate size
        int size = 0;
        ListNode counter = head;
        ListNode temp = head;
        ListNode prev = null;

        while(counter != null){
            counter = counter.next;
            size++;
        }
        if(n == size){
            // need to add at first
            head = head.next;
            return head;
        }
        if(n> size){
            return head;
        }

        int c = 1;
        int fromStart = size - n + 1;

        while(c < fromStart && temp !=null){
            prev = temp;
            temp = temp.next;
            c++;
        }

        if(temp == null){
            prev.next = null;
        } else {
            prev.next = temp.next;
            temp.next = null;
        }
        return head;
    }
}