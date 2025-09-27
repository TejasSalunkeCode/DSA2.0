import java.util.Arrays;

public class leetcode_611 {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 4};
        triangleNumber(nums);
        System.out.println(Arrays.toString(nums));
    }
    
    static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        System.out.println(nums);
        int count=0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(nums[i]+nums[j]>nums[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
