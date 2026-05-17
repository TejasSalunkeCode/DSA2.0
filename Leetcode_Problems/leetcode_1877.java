import java.util.Arrays;

public class leetcode_1877 {

    public static void main(String[] args) {
        int[] nums = { 3, 5, 2, 3 };
        System.out.println(minPairSum(nums));
    }

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0,i=0,j=nums.length-1;

        while (i<nums.length/2) {
            max=Math.max(max, nums[i]+nums[j]);
            i++;
            j--;
        }

        return max;
    }

}
