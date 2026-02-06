import java.util.Arrays;

public class leetcode_3634 {
    public static void main(String[] args) {
        int[] arr = {1,6,2,9};
        int k = 3;
        System.out.println(minRemoval(arr, k));
    }

    // 1 2 6 9


    public static int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[0]*k>=nums[nums.length-1]){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int cnt=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j >=i+1; j--) {
                cnt=nums.length-i;
                if(nums[i]*k>=nums[j]){
                   ans=Math.min(ans, cnt);
                }
            }
            cnt=0;
        }

        
        return ans;

    }
}
