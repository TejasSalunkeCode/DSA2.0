public class pattern1 {
    public static void main(String[] args) {
        printpattern(6);
    }
    static void printpattern(int n){
      for (int row = 0; row < n; row++) {
        for (int col = 1; col < n-row+1; col++) {
            System.out.print("*");
        }
        System.out.println();
      }
}
}