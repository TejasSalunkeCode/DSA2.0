public class leetcode_2946 {
    public static void main(String[] args) {
        int[][]mat = {{1,2,3},{4,5,6},{7,8,9}}; 
        int k = 4;

        System.out.println(areSimilar(mat, k));
    } 

    public static boolean areSimilar(int[][] mat, int k) {
        int m=mat[0].length;
        k%=m;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]!=mat[i][(j+k)%m]){
                    return false;
                }
            }
        }
        return true;
    }
}