public class leetcode_3507 {
    public static int minimumPairRemoval(int[]nums){
        int operations=0;
        while (!isSorted(nums)) {
            int n=nums.length;
            int minisum=Integer.MAX_VALUE;
            int index=-1;

            for (int i = 0; i < n-1; i++) {
                int sum=nums[i]+nums[i+1];
                if(sum<minisum){
                    minisum=sum;
                    index=i;
                }
            }

            nums[index]=nums[index]+nums[index+1];

            int[]newarr = new int[n-1];
            int k=0;
            for (int i = 0; i < n; i++) {
                if(i==index+1) continue;
                newarr[k++]=nums[i];
            }
            nums=newarr;
            operations++;
        }
        return operations;
    }

    private static boolean isSorted(int[]nums){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
