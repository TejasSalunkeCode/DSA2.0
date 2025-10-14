import java.util.ArrayList;
import java.util.List;

public class leetcode_3349 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 7, 8, 9, 2, 3, 4, 3, 1 };
        int k = 3;

        // Convert array to List<Integer>
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        System.out.println(hasIncreasingSubarrays(list, k));
    }

    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int inc = 1, prevInc = 0, maxLen = 0;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1))
                inc++;
            else {
                prevInc = inc;
                inc = 1;
            }
            maxLen = Math.max(maxLen, Math.max(inc >> 1, Math.min(prevInc, inc)));
            if (maxLen >= k)
                return true;
        }
        return false;
    }
}
