/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        //  Return null if the list is empty
        if(head == null) {
            return null;
        }
        
        //  Return the element if the list contains only one element
        if(head.next == null) {
            return head;
        }
        
        ListNode pointer = head;
        while(pointer != null) {
            //  Iterate until the next value of the node is equal to the current value of the node
            while(pointer.next != null && pointer.val == pointer.next.val) {
                pointer.next = pointer.next.next;
            }
            pointer = pointer.next;
        }
        return head;
    }
}