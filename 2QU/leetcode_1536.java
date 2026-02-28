import java.util.Arrays;

public class leetcode_1536 {
    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 1 }, { 1, 1, 0 }, { 1, 0, 0 } };
        System.out.println(minSwaps(arr));
    }

    public static int minSwaps(int[][] grid) {
        int cnt = 0;
        int swaps = 0;
        int[] arr = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (grid[i][j] == 0) {
                    cnt++;
                } else {
                    break;
                }
            }
            arr[i] = cnt;
            cnt = 0;
        }
        System.out.println(Arrays.toString(arr));
        int needzero = 0;
        for (int i = 0; i < arr.length ; i++) {
             needzero=arr.length-i-1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>=needzero){
                    swaps=(swaps)+j-i;
                    arr[j]=-1;
                    break;
                }else{
                    if(j==arr.length-1){
                        return -1;
                    }
                }

            }
        }

        return swaps;
    }
}