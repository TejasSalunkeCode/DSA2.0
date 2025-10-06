import java.util.Stack;

public class LL {

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

    public static int lenghtOfLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    private static boolean search(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    private static void printt(Node head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println();
    }

    private static Node removeHead(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    private static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next.next != null) {
            tail = tail.next;
        }
        tail.next = null;
        System.out.println(tail.val + "kk");
        return head;
    }

    private static Node removeK(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node removeUsingVal(Node head, int val) {
        if (head == null)
            return head;
        if (val == head.val) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.val == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node insert(Node head, int val) {
        return new Node(val, head);
    }

    private static Node insertTail(Node head, int val) {
        if (head == null)
            return new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    private static Node insertAtPostion(Node head, int el, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(el);
            } else {
                return head;
            }
        }
        if (k == 1) {
            return new Node(el, head);
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == (k - 1)) {
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertAtPostionUsingVal(Node head, int el, int val) {
        if (head == null) {
            return null;
        }
        if (val == head.val) {
            return new Node(el, head);
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.next.val == val) {
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    // Leetcode 19
    static Node removeNthFromEnd(Node head, int n) {
        if (head == null) {
            return null;
        }
        if (n == 0) {
            return head;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        int k = count - n + 1;
        Node traverse = head;
        Node prev = null;

        int loopCount = 0;

        while (traverse != null) {
            loopCount++;
            if (k == loopCount) {
                if (prev.next != null) {
                    prev.next = prev.next.next;
                    break;
                }
            }
            prev = traverse;
            traverse = traverse.next;
        }

        System.out.println(k + "hello");
        return head;

    }

    // leetcode 203
    static Node removeElements(Node head, int val) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        // Node prev=null;

        while (temp != null) {
            if (temp.val == val) {
                if (temp.next.next != null) {
                    temp = temp.next.next;
                }
                continue;
            }
            // temp=prev;
            if (temp.next != null) {
                temp = temp.next;
            }
        }
        return head;
    }

    public static Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Stack<Integer> stack = new Stack<>();
        Node curr = head;
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }
        System.out.println(stack.peek());
        head.val = stack.peek();
        Node temp = head;
        stack.pop();
        while (stack.size() != 0) {
            temp.val = stack.peek();
            stack.pop();
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteDuplicates(Node head) {
        Node dummy = new Node(0, head);
        Node prev = dummy;
        Node curr = head;

        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }

    // odd even linklist
    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null)
            return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even; // Save start of even list

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead; // Connect odd list to even list
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 2,3,1,4,5,6 };
        Node head = convertArr2LL(arr);
        // System.out.println(head.val);

        // System.out.println(lenghtOfLL(head));
        // System.out.println(search(head, 12));
        // printt(head);
        // head=removeHead(head);
        // printt(head);
        // printt(head);
        // head = removeTail(head);
        // printt(head);

        // head=removeK(head, 3);

        // head = removeUsingVal(head, 78);

        // head=insert(head, 100);

        // head = insertTail(head, 200);

        // head=insertAtPostion(head, 177, 3);

        // head=insertAtPostionUsingVal(head, 201, 32);

        // head = removeNthFromEnd(head, 2);

        // head = removeElements(head, 6);

        // head = reverseList(head);

        // head = deleteDuplicates(head);
        head=oddEvenList(head);
        printt(head);

    }
}
