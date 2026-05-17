import java.util.Arrays;

public class leetcode_2784{
    public static void main(String[] args) {
        int []nums = {5, 7, 3, 1, 5, 2, 6, 4};
        System.out.println(isGood(nums));
    }
     public static boolean isGood(int[] nums) {
        int max=nums[0];
        Arrays.sort(nums);
        int cnt=0;
        int check=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==check){
                check++;
            }else{
                return false;
            }
        }
        if(nums[nums.length-1]==nums[nums.length-2]){
            cnt=2;
        }
        if(nums.length==nums[nums.length-1]+1 && cnt==2){
            return true;
        }
        return false;
    }
}