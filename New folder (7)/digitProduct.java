public class digitProduct {
    public static void main(String[] args) {
        System.out.println(productt(33));
    }
    static int productt(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*productt(n/10);
    }
}
