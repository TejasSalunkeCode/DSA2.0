public class leetcode_268 {
    public static void main(String[] args) {
        int []nums={3,0,2,1,5};
        System.out.println(missingNumber(nums));


    }
     static int missingNumber(int[] nums) {
        int range=nums.length;
        int as=(range*(range+1))/2;
        int cs=0;
        for (int i = 0; i < nums.length; i++) {
            cs=cs+nums[i];
        }
        int ans=as-cs;
        return ans;
    }
}
