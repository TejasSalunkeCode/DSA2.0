package _47_stack_Queue_Q;
import java.util.Stack;
public class validParenthesis {
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // int i=0;

        // while (i<s.length()) {
        // char ch=s.charAt(i);
        // stack.push(ch);
        // i++;
        // }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch); // Push each character
        }

        return true;
    }
}
