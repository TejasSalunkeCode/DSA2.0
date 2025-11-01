import java.util.HashSet;

public class leetcode_3217 {

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

    public static Node modifiedList(int[] nums, Node head) {
         HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        Node dummy = new Node(-1);
        dummy.next = head;
        Node curr = head;
        Node prev = dummy;

        while (curr != null) {
            if (set.contains(curr.val)) {
                prev.next = curr.next; // delete current node
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return dummy.next;
    }



    private static void printt(Node head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] head = { 1, 2, 3, 4, 5, 3, 4, 2 };

        Node head2 = convertArr2LL(head);
        Node ans = modifiedList(nums, head2);
        printt(ans);
        // System.out.println(ans);
    }
}



      