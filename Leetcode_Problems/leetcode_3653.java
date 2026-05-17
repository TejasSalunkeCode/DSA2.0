import java.util.Arrays;

public class leetcode_3653 {
    public static void main(String[] args) {
           int[] nums = {2,3,1,5,4};
           int[][] queries = {{1,4,2,3},{0,2,1,2}};
           System.out.println(xorAfterQueries(nums, queries));
        }
    // l r k v
    // 0 1 2 3

    public static int xorAfterQueries(int[] nums, int[][] queries) 
    {
        int result=0;
         for (int i = 0; i < queries.length; i++) {
            System.out.println("hello world");
          for (int j = queries[i][0]; j <=queries[i][1]; j=j+queries[i][2]) {
            nums[j]=nums[j]*queries[i][3];
            System.out.println("hello");
          }
         }

         for (int i = 0; i < nums.length; i++) {
            result=result^nums[i];
         }

         System.out.println(Arrays.toString(nums));
         return result;
    }
}