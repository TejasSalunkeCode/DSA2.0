package _46_stack_Que;

public class mainQueue {
    public static void main(String[] args) throws Exception {
        CustomQueue q1 = new CustomQueue();
        q1.insert(34);
        q1.insert(54);
        q1.insert(94);
        q1.insert(56); 
        q1.insert(11);
        q1.dispaly(); 
        System.out.println();
        System.out.println(q1.remove());
        q1.dispaly();
    }
}
