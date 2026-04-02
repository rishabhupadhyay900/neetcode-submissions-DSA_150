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
    public void reorderList(ListNode head) {
    
    // Find the middle
    ListNode slow = head;
    ListNode fast = head.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Reverse the second half
    ListNode curr = slow.next;
    ListNode prev = slow.next = null;
    
    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    // Merge the two halves
    ListNode first = head;
    ListNode second = prev;
    while (second != null) {
        ListNode firstNext = first.next;
        ListNode secondNext = second.next;
        first.next = second;
        second.next = firstNext;
        first = firstNext;
        second = secondNext;
    }
}

}
