import java.util.PriorityQueue;
import java.util.*;
import java.util.Comparator;


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
    // k-=1;
    // while (temp!=null && k > 0) {
    // k--;
    // temp=temp.next;
    // }
    // return temp;
    // }

    // public static Node reverseKGroup(Node head, int k) {
    // Node temp = head;
    // Node prevLast = null;
    // while (temp!=null) {
    // Node kThNode = getKthNode(temp, k);
    // if(kThNode==null){
    // if(prevLast){
    // prevLast.next=temp;
    // break;
    // }
    // Node nextNode = kThNode.next;
    // kThNode.next=null;
    // reverseLinklist(temp);
    // if(temp==head){
    // head=kThNode;
    // }else{
    // prevLast.next=kThNode;
    // }
    // prevLast=temp;
    // temp=nextNode;
    // }
    // return head;
    // }
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

    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        Node temp = head;
        int count = 1;

        // Find length and make list circular
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        temp.next = head; // make circular

        System.out.println(count + "hii");

        k = k % count;
        if (k == 0)
            return head;

        int taill = count - k;
        System.out.println(k + "kk");

        Node temp1 = head;
        while (taill > 1) {
            temp1 = temp1.next;
            taill--;
        }

        head = temp1.next;
        temp1.next = null;

        System.out.println(temp1.val);
        System.out.println(taill + "eee");

        return head;
    }

    // public static Node rotateRight(Node head, int k) {
    // Node temp = head;
    // int count = 0;
    // int taill;
    // while (temp != null) {
    // count++;
    // temp = temp.next;
    // if(temp.next==null){
    // temp.next=head;
    // count++;
    // break;
    // }
    // }
    // System.out.println(count + "hii");
    // if (count < k) {
    // if (k % count == 0) {
    // return head;
    // }
    // int rotate = k % count;
    // taill=count-rotate;
    // System.out.println(rotate + "kk");
    // }else{
    // taill=count-k;
    // }
    // Node temp1=head;
    // while (taill>0) {
    // temp1=temp1.next;
    // taill--;
    // }
    // head=temp1.next;
    // temp1.next=null;
    // System.out.println(temp1.val);
    // System.out.println(taill+"eee");

    // return head;
    // }

    public static Node mergeTwoLists(Node list1, Node list2) {
        Node t1 = list1;
        Node t2 = list2;
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if (t1 != null)
            temp.next = t1;
        else
            temp.next = t2;
        return dummyNode.next;
    }

    public static Node mergeTwoLists2(Node list1, Node list2) {
        Node temp = list1;
        Node temp2 = list2;
        int count1 = 0, count2 = 0;
        while (temp != null) {
            count1++;
            temp = temp.next;
        }
        while (temp2 != null) {
            count2++;
            temp2 = temp2.next;
        }
        int length = count1 + count2;
        System.out.println(length + "lengthhh");
        return temp;
    }

    public static Node mergeKLists(Node[] lists) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>(new Comparator<Node>() {
            public int compare(Node a, Node b) {
                return Integer.compare(a.val, b.val);
            }
        });

        for (Node node : lists) {
            if (node != null) pq.add(node);
        }

        Node dummy = new Node(-1);
        Node tail = dummy;
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            tail.next = cur;
            tail = tail.next;
            if (cur.next != null) pq.add(cur.next);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4 };
        int[] arr2 = { 1, 3, 5 };
        Node head = convertArr2LL(arr);
        Node head2 = convertArr2LL(arr2);

        Node ansHead = mergeTwoLists2(head, head2);
        printt(ansHead);

        // head=findMiddle(head);
        // System.out.println(findMiddle(head));

        // Node rotated = rotateRight(head, 4);
        // System.out.println(rotated);
        // printt(rotated);

        // head=findMiddleUsing2Pointer(head);
        // System.out.println(findMiddleUsing2Pointer(head));
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
        // Node start = firstNodeCycle(n1);
        // System.out.println(firstNodeCycle(start));
    }

}