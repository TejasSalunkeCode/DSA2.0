public class leetcode_53 {
    public static void main(String[] args) {
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;

        int start=0;
        int ansStart=-1;
        int ansEnd=-1;

        for (int i = 0; i < nums.length; i++) {
            if(sum==0){
                start=i;
            }
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }

        return maxi;
    }
}
