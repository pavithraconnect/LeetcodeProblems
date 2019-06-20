import java.util.*;
class ReverseStack{
  static Stack<Integer> stack = new Stack<>();
  public static void reverse(){
    if(stack.size()>0){
      int x = stack.peek();
      stack.pop();
      reverse();
      insertAtBottom(x);
    }
  }
  public static void insertAtBottom(int x){
    if(stack.isEmpty()){
      stack.push(x);
    }
    else{
      int val = stack.peek();
      stack.pop();
      insertAtBottom(x);
      stack.push(val);
    }
  }
  public static void main(String[] args) {
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println("Stack is");
    System.out.println(stack); 
    reverse();
    System.out.println("Reversed stack is");
    System.out.println(stack);

  }
}