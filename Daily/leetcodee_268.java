import java.util.Arrays;

public class leetcodee_268 {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] != 0)
            return 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }

        return nums.length;
    }
}
