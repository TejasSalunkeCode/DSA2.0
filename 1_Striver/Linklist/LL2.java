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

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 7, 8, 9 };
        Node head = convertArr2LL(arr);
        // head=findMiddle(head);
        // System.out.println(findMiddle(head));

        // head=findMiddleUsing2Pointer(head);
        System.out.println(findMiddleUsing2Pointer(head));
        // printt(head);
    }

}