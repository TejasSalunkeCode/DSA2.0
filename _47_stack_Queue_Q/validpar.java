package _47_stack_Queue_Q;

import java.util.Stack;

public class validpar {
    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(isValid(str));
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push each character
            }
            if (!stack.isEmpty()) {

                if (stack.peek() == '(' && ch == ')') {
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {

                if (stack.peek() == '{' && ch == '}') {
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {

                if (stack.peek() == '[' && ch == ']') {
                    stack.pop();
                }
            }

        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
