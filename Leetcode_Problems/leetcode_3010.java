public class leetcode_3010 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 12 };
        System.out.println(minimumCost(nums));
    }

    public static int minimumCost(int[] nums) {
        int sum=nums[0];
        int res=Integer.MAX_VALUE;
        for (int i = 1; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum=sum+nums[i]+nums[j];
                res=Math.min(sum, res);
                sum=nums[0];
            }
        }
        return res;
    }

}
