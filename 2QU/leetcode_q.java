import java.util.Arrays;

public class leetcode_q {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int []arr=twoSum(nums, target);
        System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(nums));
    }

    public static int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while (left!=right) {
            if(nums[left]+nums[right]==target){
                return new int[] {left,right};
            }else if(nums[left]+nums[right]>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }

}
