import java.lang.reflect.Array;
import java.util.Arrays;

public class search {
    public static void main(String[] args) {
        char[][] arr = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word = "ABCCED";
        System.out.println(find(arr, word));

    }

    static boolean find(char[][] board, String word) {

        
        String ans = "";
        int length=word.length();
        System.out.println(board.length);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("word: "+ans);
        int i=0;
        System.out.println("next");
        while (length!=0) {
            for (int j = 0; j < board.length; j++) {
                for (int j2 = 0; j2 < board[i].length; j2++) {
                    
                }
            }
        }
        
        return true;
    }
}
