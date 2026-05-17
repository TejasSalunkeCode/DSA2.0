public class leetcode_1536 {

    public static int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] zeros = new int[n];

        // Step 1: Count trailing zeros for each row
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) {
                    count++;
                } else {
                    break;
                }
            }
            zeros[i] = count;
        }

        int swaps = 0;

        // Step 2: Arrange rows
        for (int i = 0; i < n; i++) {
            int needed = n - i - 1;
            int j = i;

            // Find row with enough trailing zeros
            while (j < n && zeros[j] < needed) {
                j++;
            }

            // If no such row found
            if (j == n) {
                return -1;
            }

            // Bring row j to position i using adjacent swaps
            while (j > i) {
                int temp = zeros[j];
                zeros[j] = zeros[j - 1];
                zeros[j - 1] = temp;
                swaps++;
                j--;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[][] arr = { {0,0,1}, {1,1,0}, {1,0,0} };
        System.out.println(minSwaps(arr));
    }
}