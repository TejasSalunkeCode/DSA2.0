public class pattern4 {
    public static void main(String[] args) {
        printpattern(5);
    }
    static void printpattern(int n){
        for (int row = 1; row <= n; row++) {
            // int num=1;
            for (int col = 1;  col <= row; col++) {
                // System.out.print(num+" ");
                // num++;
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
