import java.util.Arrays;

public class leetcode_41 {
    public static void main(String[] args) {
        int[] arr = { -1, 1, 3, 4 };
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        if (nums[0] > 1) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i]+1);
            if (i + 1 != nums.length && nums[i] < 0 && nums[i + 1] > 0 && nums[i + 1] != nums[i] && nums[i + 1] != 1) {
                return 1;
            }
            if (i + 1 != nums.length && nums[i] + 1 != nums[i + 1] && nums[i] >= 0 && nums[i] != nums[i + 1]) {
                return nums[i] + 1;
            }
            if (i == nums.length - 1 && nums[i] > 0) {
                return nums[i] + 1;
            }
        }

        return 1;
    }
}
