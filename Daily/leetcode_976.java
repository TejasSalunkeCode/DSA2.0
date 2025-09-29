import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode_976 {
    public static void main(String[] args) {
        // int []arr={1,2,1,10};
        int[] arr = {1,2,1,10};
        System.out.println(largestPerimeter(arr));
    }

    static int largestPerimeter(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int []arr2=new int[nums.length];

        // if(nums[nums.length-3]+nums[nums.length-2]>nums[nums.length-1]){
        // ans=ans+nums[nums.length-3]+nums[nums.length-2]+nums[nums.length-1];
        // return ans;
        // }
        int k=0;
        System.out.println(Arrays.toString(nums));
        for (int i = nums.length-1; i >=0; i--) {
            arr2[k]=nums[i];
            k++;
        }
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr2.length-2; i++) {
            for (int j = i+1; j < arr2.length-1; j++) {
                for (int j2 = j+1; j2 < arr2.length; j2++) {
                    if(arr2[i]+arr2[j]>arr2[j2]){
                        ans=ans+arr2[i]+arr2[j]+arr2[j2];
                        return ans;
                    }
                }
            }
        }

        return 0;
    }
}
