import java.util.Arrays;

public class leetcode_1727 {
    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 1},
            {1, 1, 1},
            {1, 0, 1}
        };

        
        int result = largestSubmatrix(grid);
        System.out.println("Largest Submatrix Area: " + result);
    }
    public static int largestSubmatrix(int[][]grid){
        int m=grid.length,n=grid[0].length;
        int ans=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i>0 && grid[i][j]>0){
     
  
                    grid[i][j]+=grid[i-1][j];
                }
            }
            int temp[]=grid[i].clone();
            Arrays.sort(temp);
            for (int k = 0; k < n; k++) {
                int width=n-k;
                ans=Math.max(ans, temp[k]*width);
            }
        }
        return ans;
    }
}
