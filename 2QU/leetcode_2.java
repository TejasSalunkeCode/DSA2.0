
public class leetcode_2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Create first number: 342 (2 -> 4 -> 3)
        leetcode_2 obj = new leetcode_2();
        ListNode l1 = obj.new ListNode(2);
        l1.next = obj.new ListNode(4);
        l1.next.next = obj.new ListNode(3);

        // Create second number: 465 (5 -> 6 -> 4)
        ListNode l2 = obj.new ListNode(5);
        l2.next = obj.new ListNode(6);
        l2.next.next = obj.new ListNode(4);

        // Call function
        ListNode result = addTwoNumbers(l1, l2);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }

}
