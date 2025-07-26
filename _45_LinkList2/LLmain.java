package _45_LinkList2;

public class LLmain {
    public static void main(String[] args) {
        LLRec list = new LLRec();
        list.insertFirst(12);
        list.insertFirst(12);
        list.insertFirst(12);
        list.insertFirst(33);
        list.insertFirst(56);
        list.insertFirst(90);
        list.insertFirst(99);

        list.display();
        // list.insertRec(88, 2);
        list.duplicate();
        list.display();
    }
}
