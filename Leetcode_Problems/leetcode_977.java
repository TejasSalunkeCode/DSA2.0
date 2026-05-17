import java.util.Arrays;

public class leetcode_977 {
    public static void main(String[] args) {

    int[]nums={2,4,6,8};
    int ans[]=sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sortedSquares(int[] nums) {
        int[] arr2 = new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
          arr2[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr2);
        return arr2;
}
}
