public class rotateM {
   public static void main(String[] args) {
    int[][]matrix={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };
        int[][] result = rotate(matrix);

        // Print matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }



   public static int[][] rotate(int matrix[][]){
    int[][]newM= new int[matrix.length][matrix[0].length];

    int k=matrix.length-1,m=0;
    for (int i = 0; i < newM.length; i++) {
        for (int j = 0; j < newM[0].length; j++) {
            newM[m][k]=matrix[i][j];
            m++;
        }
        m=0;
        k--;
    }

    return newM;

   }
   
}
