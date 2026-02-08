package _45_LinkList2;

public class LLRec {
    private Node head;
    private Node tail;
    private int size;

    public LLRec() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        System.out.println(node);
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

   
   public void duplicate(){
    Node node =head;

    while (node.next !=null) {
        if(node.value==node.next.value){
            node.next=node.next.next;
            size--;
        }else{
            node=node.next;
        }
    }
    tail=node;
    tail.next=null;
   }

   
   
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

  

}
