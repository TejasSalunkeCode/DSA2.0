package _44_LinkList;

public class main {  
   public static void main(String[] args) {
    
     LL list = new LL();
     list.insertFirst(13);

     list.insertFirst(3);
     list.insertFirst(7);
     list.insertFirst(21);

     list.insertAtLast(55);

     list.insert(11, 3);
     
     list.display();
    //  list.delete();
     System.out.println(list.deleteLast());
    //  list.deleteLast();
     System.out.println(list.deleteRandom(3));
    //  list.deleteRandom(3);
    System.out.println(list.find(7));
    list.find(7);

     list.display();
   }
    
}
