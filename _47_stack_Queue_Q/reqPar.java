package _47_stack_Queue_Q;

import java.util.Stack;
 
public class reqPar {
    public static void main(String[] args) {
        String str = "())";
        System.out.println(isValid(str));
    }

    static int isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch); 
            }
            if (!stack.isEmpty()) {

                if (stack.peek() == '(' && ch == ')') {
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                if (ch == ')') {
                    stack.push(ch); 
                }
            }
            
        }
        return stack.size();
    }
}
