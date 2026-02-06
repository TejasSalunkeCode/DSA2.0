public class leetcode_1980 {
    public static void main(String[] args) {
        String[] nums ={"111","011","001"};
        System.out.println(findDifferentBinaryString(nums));
    }

    public static String findDifferentBinaryString(String[] nums) {
    int n = nums.length;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // Flip the i-th bit of nums[i]
            char c = nums[i].charAt(i);
            ans.append(c == '0' ? '1' : '0');
        }
        return ans.toString();
    }
}
