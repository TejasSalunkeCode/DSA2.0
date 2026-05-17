
import java.util.Scanner;

public class _67_leetcode {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);  // Append the current bit
            carry = sum / 2;         // Calculate carry
        }

        return result.reverse().toString(); // Reverse the result to get final output
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String a = scanner.nextLine();

        System.out.print("Enter second binary number: ");
        String b = scanner.nextLine();

        String result = addBinary(a, b);

        System.out.println("Sum: " + result);

        scanner.close();
    }
}
