class ReverseLinkedList{
  public static Node reverseLinkedList(Node node){
      Node current = node;
      Node prev = null;
      Node next = null;
      while(current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }
      node = prev;
      return node;
  }
  public static int middleElement(Node node){
    Node slow = node;
    Node fast = node;
    while(fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow.data;
  }
  public static int nthElement(Node node, int n){
    int count = 1;
    while(node != null){
      if(count == n){
        return node.data;
      }
      count++;
      node = node.next;
    }
    return 0;
  }
  public static void print(Node node){
    while(node!=null){
      System.out.print(node.data+"->");
      node = node.next;
    }
    System.out.println("NULL");
  }
  public static void main(String[] args) {
    Node node = new Node(5);
    node.next=new Node(6);
    node.next.next= new Node(7);
    node.next.next.next= new Node(8);
    node.next.next.next.next= new Node(9);
    System.out.println("Original Linked List is ");
    print(node);
    node = reverseLinkedList(node);
    System.out.println("Reversed Linked List is ");
    print(node);
    System.out.println("Middle element "+middleElement(node));
    System.out.println("2nd element "+nthElement(node,2));
  }
}