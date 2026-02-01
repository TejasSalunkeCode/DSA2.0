import java.util.Arrays;

public class leetcode_3194 {
    public static void main(String[] args) {
        int[]arr={7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(arr));
    }
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Double min=Double.MAX_VALUE;
        int i=0,j=nums.length-1;
        while (i<j) {
            // System.out.println((nums[i]+nums[j])/2);
            double res=((nums[i]+nums[j])/2.0);
            System.out.println(res);
            min=Math.min(min,res);
            i++;
            j--;
        }
        return min;
    }
}
