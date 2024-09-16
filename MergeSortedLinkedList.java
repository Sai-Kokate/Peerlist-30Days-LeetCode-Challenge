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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode iterator = ans;

        while(list1 != null & list2 != null){
            if(list1.val <= list2.val){
                ListNode temp = list1;
                list1=list1.next;
                iterator.next = temp;
                iterator = iterator.next; 
            } else{
                ListNode temp = list2;
                list2=list2.next;
                iterator.next = temp;
                iterator = iterator.next; 
            }
        }

        if(list1 ==null){
            iterator.next = list2;
        }

        if(list2 ==null){
            iterator.next = list1;
        }

        return ans.next;
    }
}