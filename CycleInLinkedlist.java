public class CycleInLinkedlist {
    Node head;
    public boolean hasCycle(Node head){
        Node fast = head.next, slow=head;
        if(head == null)
            return false;
        while(fast!=null &fast.next!=null && slow !=null){
            if(fast == slow){
                return true;
            }
            fast = fast.next.next;
            slow=slow.next;
        }
        return false;
    }
}
