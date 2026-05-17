import java.util.Arrays;

public class leetcode_378 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        System.out.println(kthSmallest(matrix, 8));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int cnt = 0;

        int r = matrix.length, c = matrix[0].length;
        int[] arr = new int[r * c];
        int mk = 0;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[mk++] = matrix[i][j];

        Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
                cnt++;
                if (cnt == k) {
                    return arr[i];
                }
        }
        return -1;
    }
}
