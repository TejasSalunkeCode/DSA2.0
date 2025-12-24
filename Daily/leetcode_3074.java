import java.util.Arrays;

public class leetcode_3074 {
    public static void main(String[] args) {
        int[] apple = { 5,5,5 };
        int[] capacity = { 2,4,2,7 };
        System.out.println(minimumBoxes(apple, capacity));
    }

    public static int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0, ans = 0;
        int count = 0;
        for (int i = 0; i < apple.length; i++) {
            sum = sum + apple[i];
        }
        System.out.println(sum);
        Arrays.sort(capacity);
        // 1 2 3 4 5

        if (capacity[capacity.length - 1] == sum) {
            return 1;
        }

        for (int i = capacity.length - 1; i >= 0; i--) {
            count = count + 1;
            ans = ans + capacity[i];
            if (ans >= sum) {
                return count;
            }
        }

        return count;
    }
}
