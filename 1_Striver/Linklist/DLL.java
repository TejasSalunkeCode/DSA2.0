public class DLL {
    private static class Node { // 🔹 made static
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
            this.prev = null;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;

        }
    }

    public static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }
        return head;
    }

    private static Node removeHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        head = head.next;
        head.prev = null;
        return head;
    }

    private static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = temp.prev;
        newNode.next = null;
        // temp.prev=null;
        return head;
    }

    private static Node removeK(Node head, int k) {
        if (head == null) {
            return null;
        }
        Node newNode = head;
        int count=0;
        while (newNode!=null) {
            count++;
            if(k==count) break;
            newNode=newNode.next;
        }
        Node front=newNode.next;
        Node back=newNode.prev;

        if(front==null && back==null){
            return null;
        }else if(front==null){
            return removeTail(head);
        }else if(back==null){
            return removeHead(head);
        }
        back.next=front;
        front.prev=back;

        //Unnecessary
        newNode.next=null;
        newNode.prev=null;

        return head;
    }


    private static void deleteNode(Node temp){
        Node back=temp.prev;
        Node front=temp.next;
        if(front==null){
            back.next=null;
            temp.prev=null;
            return;
        }
        back.next=front;
        front.prev=back;

        temp.next=temp.prev=null;
    }

    //insertion
    public static Node insertHead(Node head,int val){
        Node newHead = new Node(val,head,null);
        head.prev=newHead;
        return newHead;
    }

    private static Node insertAtTail(Node head,int val){
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        Node newTail = new Node(val,head,null);
        temp.next=newTail;
        newTail.prev=temp;
        newTail.next=null;
        return head;
    }

    private static Node insertBeforeTail(Node head,int val){
        if(head.next==null){
            return insertHead(head, val);
        }
        Node tail=head;
        while (tail.next!=null) {
            tail=tail.next;
        }
        Node prev = tail.prev;
        Node newNode = new Node(val, tail, prev);
        prev.next=newNode;
        tail.prev=newNode;
        return head;
    }

    private static Node insertBeforeKthEle(Node head,int k,int val){
        if(k==1){
            return insertHead(head, val);
        }
        Node temp = head;
        int cnt=0;
        while (temp!=null) {
            cnt++;
            if(cnt==k) break;
            temp=temp.next;
        }
        Node back = temp.prev;
        Node newNode = new Node(val,temp,back);
        back.next=newNode;
        temp.prev=newNode;
        return head;
    }

    private static void insertBeforeNode(Node node,int val){
        Node back=node.prev;
        Node newNode = new Node(val, node, back);
        back.next=newNode;
        newNode.next=node;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 12, 45, 32, 78, 99 };
        Node head = convertArr2LL(arr);
        // head=removeHead(head);

        // head = removeTail(head);

        // head=removeK(head, 4);

        // deleteNode(head.next);

        //insert Head

        // head=insertHead(head, 89);

        // head=insertAtTail(head, 55);

        // head=insertBeforeTail(head, 33);

        // head=insertBeforeKthEle(head, 3, 65);

        insertBeforeNode(head.next.next, 44);
        print(head);

    }
}
