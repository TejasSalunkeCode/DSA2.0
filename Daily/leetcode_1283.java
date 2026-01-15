import java.util.Arrays;

public class leetcode_1283 {
    public static void main(String[] args) {
        int[] nums = { 1,2,5,9 };
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int low = nums[0];
        int high = nums[nums.length - 1];
        int mid=0;
        double ans = 0;
        int j = 0;
        for (j = low; j < high; j++) {
            for (int i = 0; i < nums.length; i++) {
                mid = (low + high) / 2;
                ans = ans + Math.ceil((double) nums[i] / mid);
            }
            if(ans==threshold){
                return j;
            }
            if(ans<threshold){
                break;
            }
            if(ans>threshold){
                low=mid;
                mid=(low+high)/2;
            }
            ans=0;
        }
        return j;

    }
}
