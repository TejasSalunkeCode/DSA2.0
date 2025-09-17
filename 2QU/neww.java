public class neww {
    public static void main(String[] args) {
        int[] arr = { 1,5, 233, 7 };
        System.out.println(predictTheWinner(arr));
    }

    static boolean predictTheWinner(int[] nums) {
    return sum(nums,0,nums.length-1)>=0;
    }
    static int sum(int []nums,int i,int j){
        if(i==j){
            return nums[j];
        }
        int sum1=nums[i]-sum(nums,i+1,j);
        int sum2=nums[j]-sum(nums,i,j-1);
        return Math.max(sum1,sum2);
    }
}
 
