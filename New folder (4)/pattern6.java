public class pattern6{
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
           int totalcolInRow=row>n ? 2*n-row:row;
           for (int col = 0; col < totalcolInRow; col++) {
            System.out.print("* ");
           }  
           System.out.println();
        }
    }
}