public class Stack1 {
    Node top;
    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }
    public int peek(){
        if(top!=null){
            return top.data;
        }
        return -1;
    }
    public void push(int data){
        Node newNode=new Node(data);
        if(top!=null){
            newNode.next=top;
        }
        top=newNode;
    }
    public int pop(){
        if(top!=null){
            int data=top.data;
            top=top.next;
            return data;
        }
        return -1;
    }
    public static void main(String args[]){
        Stack1 stack=new Stack1();
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
