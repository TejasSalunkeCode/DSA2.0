public class leetcode_1458 {
    int m, n;
    int[][] t;
    static final int NEG = (int)-1e9;

    int solve(int[] nums1, int[] nums2, int i, int j) {
        if (i == m || j == n) return NEG;

        if (t[i][j] != NEG) return t[i][j];

        int val = nums1[i] * nums2[j];

        int takeBoth = val + solve(nums1, nums2, i + 1, j + 1);
        int skipNums1 = solve(nums1, nums2, i + 1, j);
        int skipNums2 = solve(nums1, nums2, i, j + 1);

        return t[i][j] = Math.max(
                val,
                Math.max(takeBoth, Math.max(skipNums1, skipNums2))
        );
    }

    public int maxDotProduct(int[] nums1, int[] nums2) {
        m = nums1.length;
        n = nums2.length;

        t = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                t[i][j] = NEG;

        return solve(nums1, nums2, 0, 0);
    }
}
