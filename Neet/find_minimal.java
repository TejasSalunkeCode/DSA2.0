package Neet;

import java.util.Arrays;

public class find_minimal {
    public static void main(String[] args) {
       int [] nums = {3,4,5,6,1,2};
       System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
