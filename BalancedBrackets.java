import java.util.*;
class BalancedBrackets{
public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<Character, Character>(){
            {put('}','{');
             put(']','[');
             put(')','(');}};
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='{'||c=='['||c=='('){
                stack.push(c);
            }
            else if(c=='}'||c==']'||c==')'){
                if(!stack.isEmpty()){
                    char k = stack.peek();
                    if(map.get(c)==k){
                        stack.pop();
                    }
                    else{
                    return false;
                    }
                }
                else{
                    stack.push('x');
                }
            }
        }
        return stack.isEmpty();
    }
  public static void main(String[] args) {
    System.out.println(isValid("]"));
  }
}