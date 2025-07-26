package _46_stack_Que;

public class mainStack {
    public static void main(String[] args) throws Exception {
        // CustomStack stack = new CustomStack(5);
        DynamicStack stack = new DynamicStack(5);

        stack.push(34);
        stack.push(45);
        stack.push(21);
        stack.push(89);
        stack.push(33);
        stack.push(133);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
