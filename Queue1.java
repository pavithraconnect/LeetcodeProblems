public class Queue1 {
    Node head,tail;
    public boolean isEmpty(){
        return head==null;
    }
    public int peek(){
        return head.data;
    }
    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        if(tail!=null){
            tail.next = node;
        }
        tail = node;
    }
    public int remove(){
        if(head == null){
            return -1;
        }
        int data=head.data;
        head=head.next;
        return data;
    }
    public static void main(String args[]){
        Queue1 queue=new Queue1();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
