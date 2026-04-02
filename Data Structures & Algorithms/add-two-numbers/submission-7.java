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
        // reverse both lsit
        
        if(l1 == null && l2 == null){
            ListNode x = new ListNode(0);
            return x;
        }
        ListNode curr1  = l1;
        ListNode prev = null;
        l1 = reverseList(l1);
        l2 = reverseList(l2);

     
        // COMPUTE LIST 1 
        
        ListNode curr = l1;
        int num1 =0;
        while(curr != null){
            num1 = num1*10 + curr.val;
            curr = curr.next;
        }
        //COMPUTE LIST 2
        curr = l2;
        int num2 = 0;
        while(curr != null){
            num2 = num2*10 + curr.val;
            curr = curr.next;
        }
        int ans  = num1 + num2;
        

        
        ListNode b = new ListNode(-1);
        ListNode a = b;
        if(ans == 0){
            a.next = new ListNode(0);
        }
        else{
        while(ans >0){
           a.next = new ListNode(ans%10);
             a = a.next;
            ans = ans/10;
            
        }
        }
        
      return b.next;
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
