import java.util.Arrays;

public class leetcode_3289 {
    public static void main(String[] args) {
        int []arr={0, 1, 2, 3, 0, 2};
        System.out.println(getSneakyNumbers(arr));
    }
      public static int[] getSneakyNumbers(int[] nums) {
        int []ans = new int[2];
        int k=0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    if(ans[0]==nums[i] || ans[1]==nums[i]){
                        break;
                    }
                    ans[k]=nums[i];
                    k++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
