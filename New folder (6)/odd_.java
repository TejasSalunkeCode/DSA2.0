public class odd_ {
    public static void main(String[] args) {
        int n=79;
        System.out.println(oddd(n));
    }
    private static boolean oddd(int n){
        return (n & 1) == 1;
    }
}
