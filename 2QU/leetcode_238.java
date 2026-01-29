import java.util.Arrays;

public class leetcode_238 {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 0, 4 };
        int[] nums = productExceptSelf(arr);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int ans = 1, cnt = 0;

        for (int k = 0; k < arr.length; k++) {
            if (nums[k] != 0) {
                ans = ans * nums[k];
            } else {
                cnt++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (cnt >= 2) {
                arr[i]=0;
            }
            else if(nums[i] != 0) {
                if (cnt > 0) {
                    arr[i] = 0;
                } else {
                    arr[i] = ans / nums[i];
                }
            } else {
                arr[i] = ans;
            }
        }

        return arr;

    }
}
