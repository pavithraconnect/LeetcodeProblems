public class LinkedList1 {
    Node head;

    public LinkedList1 append(LinkedList1 list, int data) {
        if (list.head == null) {
            list.head = new Node(data);
            return list;
        } else {
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
        return list;
    }
    public LinkedList1 prepend(LinkedList1 list,int data){
        Node newHead=new Node(data);
        newHead.next=list.head;
        list.head=newHead;
        return list;
    }
    public LinkedList1 delete(LinkedList1 list,int data){
        if(list.head == null){
            return null;
        }
        if(list.head.data==data){
            list.head=list.head.next;
            return list;
        }
        Node current=list.head;
        while(current.next!=null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return list;
            } else {
                current = current.next;
            }
        }
        return list;
    }
    public void print(LinkedList1 list){
        if(list.head == null){
            return;
        }
        else {
            Node node = list.head;
            System.out.println("LinkedList");
            while (node != null) {
                System.out.println(node.data);
                node=node.next;
            }
        }
    }
    public static void main(String args[]){
        LinkedList1 list= new LinkedList1();
        list= list.append(list,2);
        list= list.append(list,3);
        list= list.append(list,4);
        list= list.append(list,5);
        list.print(list);
        list= list.prepend(list,1);
        list.print(list);
        list.delete(list,4);
        list.print(list);
    }
}
