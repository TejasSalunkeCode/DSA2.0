public class LL2 {
    private static class Node { // 🔹 made static
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private static void printt(Node head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println();
    }

    // middle
    public static Node findMiddle(Node head) {
        if (head == null)
            return null;
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (count % 2 == 0) {
            count = (count / 2) + 1;
        } else {
            count = (count / 2) + 1;
        }
        temp = head;
        while (temp != null) {
            count--;
            if (count == 0) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // middle of LL using slow and fast pointer;

    public static Node findMiddleUsing2Pointer(Node head) {
        if (head == null)
            return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
        return slow;
    }

    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static Node firstNodeCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                System.out.println(slow.val);
                return slow;
            }
        }
        return null;
    }

    // public static Node getKthNode(Node temp,int k){
    //     k-=1;
    //     while (temp!=null && k > 0) {
    //         k--;
    //         temp=temp.next;
    //     }
    //     return temp;
    // }

    
    //  public static Node reverseKGroup(Node head, int k) {
    //     Node temp = head;
    //     Node prevLast = null;
    //     while (temp!=null) {
    //         Node kThNode = getKthNode(temp, k);
    //         if(kThNode==null){
    //             if(prevLast){
    //                 prevLast.next=temp;
    //                 break;
    //             }
    //             Node nextNode = kThNode.next;
    //             kThNode.next=null;
    //             reverseLinklist(temp);
    //             if(temp==head){
    //                 head=kThNode;
    //             }else{
    //                 prevLast.next=kThNode;
    //             }
    //             prevLast=temp;
    //             temp=nextNode;
    //         }
    //         return head;
    //     }
    // }
    
    public static Node getKthNode(Node temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public static Node reverseKGroup(Node head, int k) {
        Node temp = head;
        Node prevLast = null;

        while (temp != null) {
            Node kThNode = getKthNode(temp, k);
            if (kThNode == null) { // Less than k nodes left
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }

            Node nextNode = kThNode.next;
            kThNode.next = null;

            // reverse the current k-group
            Node newHead = reverseLinkedList(temp);

            if (temp == head) {
                head = newHead;
            } else {
                prevLast.next = newHead;
            }

            prevLast = temp;
            temp = nextNode;
        }

        return head;
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 7, 8, 9 };
                Node head = convertArr2LL(arr);
        // head=findMiddle(head);
        // System.out.println(findMiddle(head));

        // head=findMiddleUsing2Pointer(head);
        System.out.println(findMiddleUsing2Pointer(head));
        // printt(head);






        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(0);
        Node n4 = new Node(-4);

        // Link them linearly
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Create cycle: last node points to n2
        n4.next = n2;
        Node start = firstNodeCycle(n1);
        System.out.println(firstNodeCycle(start));
    }

}