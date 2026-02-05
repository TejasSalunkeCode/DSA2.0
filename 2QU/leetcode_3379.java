import java.util.Arrays;

public class leetcode_3379 {
    public static void main(String[] args) {
        int[] arr = { 3, -2, 1, 1 };
        int[] res = constructTransformedArray(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];
        boolean flag = true;
        int i = 0;
        int j = i;
        int val = 0;
        while (flag) {
            if (nums[i] == 0) {
                res[i] = nums[i];
                i++;
            } else if (nums[i] > 0) {
                val = nums[i];
                while (val != 0) {
                    if (j + 1 >= nums.length) {
                        j = 0;
                    }else{
                        j++;
                    }
                    val--;
                    System.out.println("++");

                }
                res[i] = nums[j];
                i++;
            } else {
                val = nums[i];
                while (val != 0) {
                    if (j - 1 < 0) {
                        j = nums.length - 1;
                    }else{
                        j--;
                    }
                    val++;
                    System.out.println("--");
                }
                res[i] = nums[j];
                i++;
            }
            if(i>nums.length-1){
                flag=false;
            }
            j=i;
        }
        return res;
    }
}
