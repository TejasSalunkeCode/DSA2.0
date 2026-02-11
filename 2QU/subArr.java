public class subArr {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
       int currMax = nums[0];
        int currMin = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
            // If negative, swap max & min
            if (nums[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);

            ans = Math.max(ans, currMax);
        }

        return ans;
    }
}
