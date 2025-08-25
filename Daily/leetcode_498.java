import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode_498 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } };
        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }

    static int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0 || mat[0].length==0) return new int[0];

        int m=mat.length,n=mat[0].length;
        int[]arr=new int[mat.length*mat.length];
        int i=0;
        int row=0,col=0;
        boolean up=true;


        while (row<m && col<n-1) {
            if(up){
                while (row>0 && col<n-1) {
                    arr[i++]=mat[row][col];
                    row--;
                    col++;
                }
                arr[i++]=mat[row][col];
                if(col==n-1){
                    row++;
                }else{
                    col++;
                }
            }else{
                while (col>0 && row<m-1) {
                    arr[i++]=mat[row][col];
                    row--;
                    col++;
                }
                arr[i++]=mat[row][col];
                if(col==n-1){
                    row++;
                }else{
                    col++;
                }
            }
        }

        return arr;
    }
}

