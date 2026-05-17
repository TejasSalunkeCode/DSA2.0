import java.util.Arrays;

public class leetcode_349 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = intersection(nums1, nums2);

        // print result as array
        System.out.println(Arrays.toString(result));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        int size = Math.min(nums1.length, nums2.length);
        int[] ans = new int[size];
        System.out.println(ans.length);
        int k=0;
        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i]==nums2[i]){
                ans[k]=nums1[i];
                k++;
                if(nums1[i+1]!=nums2[i+1]){
                    break;
                }
            }
        }
        return ans;
    }
}