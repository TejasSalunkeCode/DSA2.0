import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_2553 {
    public static void main(String[] args) {
        int[] arr = { 13, 25, 83, 77 };
        separateDigits(arr);
        // System.out.println(Arrays.toString(arr));
    }

    public static int[] separateDigits(int[] nums) {
        String str;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            char[] arr = Integer.toString(nums[i]).toCharArray();
            int[] nums2 = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                nums2[j] = arr[j] - '0';
            }
            for (int j = 0; j < nums2.length; j++) {
                list.add(nums2[j]);
            }
            System.out.println(list);
            Arrays.fill(nums2, 0);
            Arrays.fill(arr, '\0');

        }
        int[] arr2 = list.stream().mapToInt(Integer::intValue).toArray();


        return arr2;
    }
}
