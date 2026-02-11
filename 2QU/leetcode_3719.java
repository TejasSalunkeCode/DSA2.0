import java.util.ArrayList;
import java.util.List;

public class leetcode_3719 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 3, 3 };
        System.out.println(longestBalanced(arr));
    }

    public static int longestBalanced(int[] nums) {
        int result = 0;
        int even = 0, odd = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    if (!list.contains(nums[j])) {
                        even++;
                        list.add(nums[j]);
                    }
                } else {
                    if (!list.contains(nums[j])) {
                        odd++;
                        list.add(nums[j]);
                        
                    }
                }
                if (even == odd) {
                    result = Math.max(result, j - i + 1);
                }
            }
            list.clear();
            even = 0;
            odd = 0;
        }

        return result;
    }
}
