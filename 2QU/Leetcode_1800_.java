
import java.util.Arrays;

public class Leetcode_1800_ {
    public static void main(String[] args) {
     int nums[]={10,20,30,5,10,50};
     System.out.println(maxvalue(nums));
    }

     static int maxvalue(int[] nums) {
        int currsum=nums[0];
        int max=nums[0];

        for (int i = 1; i <nums.length; i++) {
            if(nums[i-1]<nums[i]){
                currsum=currsum+nums[i];
            }else{
                max=Math.max(max, currsum);
                currsum=nums[i];
            }
        }
        max=Math.max(max, currsum);
            return max;
    }

}