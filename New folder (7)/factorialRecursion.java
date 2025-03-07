public class factorialRecursion {
    public static void main(String[] args) {
        // System.out.println(facto(4));
        int ans=facto(5);
        System.out.println(ans);
    }
    static int facto(int n){
        if(n<=1){
            return -1;
        }
        return n*facto(n-1);
    }
}
