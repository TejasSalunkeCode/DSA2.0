
public class leetcode_2221 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(triangularSum(arr));
    }

    static int triangularSum(int[] nums) {
      int n=nums.length;
      for (int len = n; len > 1; len--) {
        for (int i = 0; i < len-1; i++) {
            nums[i]=(nums[i]+nums[i+1])%10;
        }
      }
      return nums[0];
    }
}
