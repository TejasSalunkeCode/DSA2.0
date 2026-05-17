public class leetcode_2104 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2 };
        System.out.println(subArrayRanges(nums));
    }

    public static long subArrayRanges(int[] nums) {
        long ans = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                max = Math.max(nums[j], nums[i]);
                min = Math.min(nums[j], nums[i]);
                ans = ans + max - min;
            }
        }
        return ans;
    }
}
