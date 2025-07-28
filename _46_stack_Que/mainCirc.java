package _46_stack_Que;

public class mainCirc {
    public static void main(String[] args) throws Exception{
        // CircularQueue q1 = new CircularQueue();
        DynamicQueue q1 = new DynamicQueue(4);
        q1.insert(34);
        q1.insert(54);
        q1.insert(94);
        q1.insert(56); 
        q1.insert(11);
        q1.display();
        System.out.println(q1.remove());
        q1.insert(66);
        System.out.println();
        q1.display();
    }
}
