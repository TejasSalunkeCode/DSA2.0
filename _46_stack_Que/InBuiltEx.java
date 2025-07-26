
package _46_stack_Que;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltEx {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>(); 
        // stack.push(13);
        // stack.push(34);
        // stack.push(11);
        // stack.push(56);
        // stack.push(91);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(14);
        queue.add(56);
        queue.add(73);
        queue.add(29);
        queue.add(50);

        System.out.println("peak Element : "+queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        
    }

}


