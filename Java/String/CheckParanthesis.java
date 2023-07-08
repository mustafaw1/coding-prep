package Java.String;

import java.util.Stack;

public class CheckParanthesis {
   public static boolean isBalanced(String str){
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if(c=='('){
                stack.push(')');
            }
            if(c=='['){
                stack.push(']');
            }
            if(c=='{'){
                stack.push('}');
            }else if (c==')' || c=='}' || c==']' ){
                if(stack.isEmpty() || stack.pop()!=c)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "({(}))";
        System.out.print(isBalanced(str));

    }
}
