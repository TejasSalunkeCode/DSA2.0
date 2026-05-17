import java.util.Arrays;

public class leetcode_169 {
    public static void main(String[] args) {
        int[]arr={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] nums) {
       Arrays.sort(nums); 
       int count=0;
       int length=nums.length/2;
       System.out.println(length);

       for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length; j++) {
            if(nums[i]==nums[j]){
                count++;
            }
        } 
        if(length<count){
            return nums[i];
        }
        System.out.println(count);
        count=0;
       }
       return 0;
    }
}
