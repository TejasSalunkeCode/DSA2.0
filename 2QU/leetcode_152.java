public class leetcode_152 {
    public static void main(String[] args) {
        int[]arr={2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        int res=0,prod=1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                prod=prod*nums[j];
                res=Math.max(res, prod);
            }
            prod=1;
        }
        return res;
    }
}
