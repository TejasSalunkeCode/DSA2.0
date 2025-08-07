import java.util.Arrays;

import Interface.breake;

public class test2 {

    public static void main(String[] args) {
        int[] fruits = { 0,0,1,1,1,2,2,3,3,4};
        // int[] baskets = { 6, 4, 7 };
        System.out.println(removeDuplicates(fruits));
    }

    static int removeDuplicates(int[] nums) {
        int count = 0; 

        int[] nums2 = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if(nums2[k]!=nums[i]){
                        nums2[k] = nums[i];
                    }
                    count++;
                    k++;
                }
                // else{
                //     nums2[k]=nums[j];
                // }
                // if (nums[i] == nums[j]) {
                //     nums2[k] = nums[j];
                //     k++;
                // }
                // break
            }
        }

        System.out.println(Arrays.toString(nums2));
        System.out.println(nums.length - count);
        return nums.length - count;
    }

}
