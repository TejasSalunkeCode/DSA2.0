package _44_LinkList;

public class DDLmain {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10); 
        list.insertFirst(90);
        list.insertFirst(100);
        list.insertFirst(12);
        list.insertFirst(19);

        list.insertAtLast(4); 
        list.insert(12, 99);

        list.display();
     
    }
}
