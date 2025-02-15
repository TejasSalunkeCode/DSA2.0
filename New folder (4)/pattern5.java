public class pattern5 {
    public static void main(String[] args) {
        printpattern(5);
    }///



    

    static void printpattern(int n){
        for (int row = 1; row <= n; row++) {
          for (int col = 1; col < row; col++) {
              System.out.print("*");
          }
          System.out.println();
        }
        for (int row = 0; row < n; row++) {
            for (int col = 1; col < n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
          }
  }
}
