/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        int sum,carry = 0,reminder;
        while(l1!=null || l2!=null){
            int a = (l1!=null)? l1.val : 0;
            int b = (l2!=null)? l2.val : 0;
            sum = a+b+carry;
            carry = sum / 10;
            reminder = sum % 10;
            node.next = new ListNode(reminder);
            node = node.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry>0){
            node.next = new ListNode(carry);
        }
        return head.next;
    }
}