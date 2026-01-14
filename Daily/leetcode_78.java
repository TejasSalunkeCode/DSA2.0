public class leetcode_78 {
    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        char[] arr = word.toCharArray();
        int count = arr.length;
        int k = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (arr[k] == board[i][j]) {
                    board[i][j] = '1';
                    i = 0;
                    // System.out.println(arr[k]);
                    count--;
                    k++;
                }
                if (count == 0) {
                    return true;
                }
            }
        }
        System.out.println(count);

        return false;
    }
}
