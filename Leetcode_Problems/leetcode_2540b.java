public class leetcode_2540b {
    public static void main(String[] args) {
        int[] nums1 = {4,12,13 };
        int nums2[] = { 2,4};
        System.out.println(getCommon(nums1, nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int ans = Integer.MAX_VALUE;
        int val = 0;
        int i = 0, j = i;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                val = Math.min(nums1[i], nums2[j]);
                ans = Math.min(val, ans);
                i++;
                j++;
                continue;
            }
            if (i < nums1.length && j < nums2.length && nums1[i] < nums2[j]) {
                i++;
            }
            if (i < nums1.length && j < nums2.length && nums1[i] > nums2[j]) {
                j++;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}