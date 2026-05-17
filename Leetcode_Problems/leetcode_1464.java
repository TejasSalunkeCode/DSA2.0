public class leetcode_1464{
    public static void main(String[] args) {
        int nums[]={1,1,1,1};
        System.out.println(maxProduct(nums));
    }
     public static int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE,res=1;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                res=((nums[i]-1)*(nums[j]-1));
                max=Math.max(max, res);
                System.out.println(res);
            }
        }
        return max;
    }
}