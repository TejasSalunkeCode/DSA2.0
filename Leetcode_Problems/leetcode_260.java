import java.util.Arrays;

public class leetcode_260 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 5 };
        int[] res = singleNumber(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int cnt = 1, k = 0;
        int[] arr = new int[2];
        boolean flag = true;
        int i = 0, j = i + 1;
        while (flag) {
            if (nums[i] == nums[j]) {
                cnt++;
            } else {
                arr[0] = nums[i];
                arr[1] = nums[j];
                flag = false;
            }
        }

        return arr;
    }
}
