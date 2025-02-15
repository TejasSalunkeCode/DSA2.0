public class pattern2 {
    public static void main(String[] args) {
        printpattern(6);
    }
    static void printpattern(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
