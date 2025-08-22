import java.util.Arrays;

public class leetcode_3195 {
    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 1 } };
        System.out.println(minimumArea(arr));
    }

    static int minimumArea(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int minRow = m, maxRow = -1;
        int minCol = n, maxCol = -1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        if (maxRow == -1)
            return 0; // no 1s in grid

        int height = maxRow - minRow + 1;
        int width = maxCol - minCol + 1;

        return height * width;
    }
}


