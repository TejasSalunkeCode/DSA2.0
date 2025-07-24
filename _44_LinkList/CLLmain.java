package _44_LinkList;

public class CLLmain {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(13);
        list.insert(67);
        list.insert(11);
        list.insert(90);
        list.insert(22);

        list.display(); 
        list.delete(11);
        list.display();
    }
}
