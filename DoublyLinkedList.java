public class DoublyLinkedList {
    Node head,tail;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            head.prev=null;
            tail.next=null;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
        }
    }
    public void delete(int data){
        Node node=head;
        if(head==null){
            return;
        }
        else if(head.data==data){
            head=head.next;
            head.prev=null;
        }
        else if(tail.data==data){
            tail=tail.prev;
            tail.next=null;
        }
        else {
            while(node.next!=null){
                if(node.data==data){
                    node.prev.next=node.next;
                }
                node=node.next;
            }
        }
    }
    public void print(){
        if(head == null){
            return;
        }
        else {
            Node node = head;
            System.out.println("LinkedList");
            while (node != null) {
                System.out.println(node.data);
                node=node.next;
            }
        }
    }
    public static void main(String args[]){
        DoublyLinkedList list=new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.print();
        list.delete(2);
        list.print();
    }
}
