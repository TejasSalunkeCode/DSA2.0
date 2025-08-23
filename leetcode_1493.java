
public class leetcode_1493 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 1, 1, 0, 1 };
        System.out.println(longestSubarray(arr));
    }

    static int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
