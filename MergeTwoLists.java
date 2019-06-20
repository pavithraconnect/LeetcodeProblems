/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode node = dummy;
        while(l1!=null || l2!=null){
            int x = (l1==null)?Integer.MAX_VALUE : l1.val;
            int y = (l2==null)?Integer.MAX_VALUE : l2.val;
            if(x<=y){
                node.next = l1;
                prev = l1;
                l1 = l1.next;
                node = node.next;
            }
            else{
                node.next = l2;
                prev = l2;
                l2 = l2.next;
                node = node.next;
            }
        }
        return dummy.next;
    }
}