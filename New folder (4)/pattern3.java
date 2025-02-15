public class pattern3 {
    public static void main(String[] args) {
        printpattern(5);
    }
    static void printpattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
