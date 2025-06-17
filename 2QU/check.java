import java.util.Arrays;

public class check {
    public static void main(String[] args) {
        int[]nums={7,1,5,4};
        System.out.println(maximumDifference(nums));
    }

    static int maximumDifference(int[] nums) {

        int[] arr = new int[0];
  int ans;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                 ans=nums[j]-nums[i];
                if(ans>nums[i]){
                    arr[i]=ans;
                    System.out.println(Arrays.toString(arr));
                    System.out.println("hello");
                }
            }
            return -1;
        }
        return -1;
    }

}
