package _44_LinkList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head; 
        }
        size+=1; 
    }

    public void insertAtLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val,int index){

        if(index==0){
            insertFirst(val);
            return;
        }

        if(index==size){
            insertAtLast(val);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
         temp.next=node;
         size++;
    }


    public int delete(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 1; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node=head;
        while (node!=null) {
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public int deleteLast(){
        if(size<=1){
            return delete();
        }
        Node secondLastc= get(size-1);
        int val=tail.value;
        tail=secondLastc;
        tail.next=null;
        return val;
    }

    public int deleteRandom(int index){
        if(index==0){
            return delete();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val=prev.next.value;

        prev.next=prev.next.next;

        return val;

    }

    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }



    }



}
