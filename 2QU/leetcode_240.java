public class leetcode_240 {
    public static void main(String[] args) {
        int[][] matrix = {
                { -5 }
        };
        int target = -3;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int col = matrix[0].length - 1;


        int i = 0;

        while (i < matrix.length && col >= 0) {

            if (matrix[i][col] == target) {
                return true;
            }

            if (matrix[i][col] > target) {
                col--;
                // i--;
            } else {
                i++;
            }

        }

        return false;

    }
}
