package _45_LinkList2;

import java.util.Stack;

import Interface.breake;

public class SLLQ {

    private Node head;
    private Node tail;
    private int size;

    public SLLQ() {
        
        this.size = 0;
    }

    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){  
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast!=null && fast.next !=null) {
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                Node temp = slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }


    public Node detectCycle(Node head) {
        int length=0;

        Node fast = head;
        Node slow = head;

        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length = lengthCycle(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }

        //Find the Start Node
        Node f=head;
        Node s=head;

        while (length > 0) {
            s=s.next;
            length--;
        }

        //keep moving both forward and they will meet at cycle start
        while (f!=s) {
            f=f.next;
            s=s.next;
        }
        return s;
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

    public void insertAtLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertAtLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int delete() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    } 

    public Node get(int index) {
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteLast() {
        if (size <= 1) {
            return delete();
        }
        Node secondLastc = get(size - 1);
        int val = tail.value;
        tail = secondLastc;
        tail.next = null;
        return val;
    }

    public int deleteRandom(int index) {
        if (index == 0) {
            return delete();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;

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

    public static SLLQ merge(SLLQ first, SLLQ second) {
        Node f = first.head;
        Node s = second.head;

        SLLQ ans = new SLLQ();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertAtLast(f.value);
                f = f.next;
            } else {
                ans.insertAtLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertAtLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertAtLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        SLLQ first = new SLLQ();
        SLLQ second = new SLLQ();

        first.insertAtLast(1);
        first.insertAtLast(2);
        first.insertAtLast(3);
        first.insertAtLast(4);

        second.insertAtLast(1);
        second.insertAtLast(2);
        second.insertAtLast(13);
        second.insertAtLast(17);

        SLLQ ans = SLLQ.merge(first, second);

        ans.display();

    }

}
