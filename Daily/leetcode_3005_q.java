import java.util.Arrays;

public class leetcode_3005_q {
    public static void main(String[] args) {
        int[] nums = { 10,1,12,10,10,19,10};
        System.out.println(maxFrequencyElements(nums));
    }

    static int maxFrequencyElements(int[] nums) {
    Arrays.sort(nums);

        int ans = 0;
        int freq = 0;
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans = ans + 1;
                }
            }
            if (ans > 0) {
                ans = ans + 1;
                freq = freq + ans;
            }
             if(freq>nums.length/2){
                return ans;
            }

            ans = 0;
        }

        if (freq == 0) {
            return nums.length;
        }
        return freq;
    }
}
