public class pattern10 {
   public static void main(String[] args) {
    printpattern(4);
   } 
   static void printpattern(int n){
      int originalIn=n;
      n=2*n;
      for (int row = 0; row <=n; row++) {
         for (int col = 0; col <=n; col++) {
            int ateveryIndex=originalIn-Math.min(Math.min(row,col),Math.min(n-row,n-col));
            System.out.print(ateveryIndex + " ");
         }
         System.out.println();
      }
   }
}
