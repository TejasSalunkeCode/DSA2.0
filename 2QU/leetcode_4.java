import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode_4 {
    public static void main(String[] args) {
        int[] nums1 = {  1,3 };
        int[] nums2 = { 2 ,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
          int[] arr = new int[nums1.length + nums2.length];
        int length = nums1.length + nums2.length;
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            arr[nums1.length + j] = nums2[j];
        }
        if (length % 2 == 0) {
            Arrays.sort(arr);
            int start = 0;
            int end = arr.length - 1;
            int mid = ((start + end) / 2);
            float ans = arr[mid] + arr[mid + 1];
            float finalans = (ans / 2);
            return finalans;
        } else {
            Arrays.sort(arr);
            int start = 0;
            int end = arr.length - 1;
            int mid = ((start + end) / 2);
            int ans = arr[mid];
            return ans;
        }
    }
}
