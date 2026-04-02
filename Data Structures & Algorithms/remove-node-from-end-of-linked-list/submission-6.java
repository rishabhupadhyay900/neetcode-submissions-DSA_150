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
          
          if(head == null || head.next == null){
            return null;
          }
          ListNode temp = head;
          int l =0;
          while(temp != null){
            temp = temp.next;
            l++;
          }
          
          
          ListNode prev = head;
          ListNode curr = head.next;
          int count =0;
          if(n == l){
            head = head.next;
          }
          for(int i=0;i<l-n-1;i++){
            
            prev = prev.next;
            count++;
          }
          prev.next = prev.next.next;

          return head;

    }
}
