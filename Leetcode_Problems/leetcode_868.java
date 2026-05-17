import java.util.*;

public class leetcode_868 {
    public static int binaryGap(int N) {
        int temp = 0, cnt = -1, large = 0;

        while (N != 0) {
            temp = N % 2;

            if (cnt >= 0)
                cnt++;

            if (temp == 1) {
                if (cnt > 0) {
                    large = cnt > large ? cnt : large;
                }
                cnt = 0;
            }

            N /= 2;
        }
        return large;
    }

    // Main function to test
    public static void main(String[] args) {
        leetcode_868 obj = new leetcode_868();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int result = obj.binaryGap(N);
        System.out.println("Binary Gap: " + result);

        sc.close();
    }
}