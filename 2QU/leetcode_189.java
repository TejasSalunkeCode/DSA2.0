import java.util.Arrays;

public class leetcode_189 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr, k);
    }

    public static void rotate(int[] nums, int k) {
        int []temp = new int[k-1];
        for (int i = 0; i < k; i++) {
            temp[i]=nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            nums[i-k]=nums[i];
        }

        int j=0;
        for (int i = nums.length-k; i < nums.length; i++) {
            nums[i]=temp[j];
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }


}