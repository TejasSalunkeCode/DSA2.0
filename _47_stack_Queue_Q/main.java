package _47_stack_Queue_Q;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        QueueusingStack s1 = new QueueusingStack();
        s1.add(45);
        s1.add(65);
        s1.add(445);
        s1.add(405);
        System.out.println(s1.peek());
        System.out.println(s1.remove());
        System.out.println(s1.peek());
    }
}

class QueueusingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueusingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        first.push(item);
    }

    public int remove() {

        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }
    
    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;

    }

    public boolean isEmpty(){
        return first.isEmpty();
    }
}
