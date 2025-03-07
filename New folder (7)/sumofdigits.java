public class sumofdigits {
public static void main(String[] args) {
    System.out.println(sumof(123));
}    
    static int sumof(int n){
        if(n==0){
            return 0;
        }
        // return sumof(n/10)+(n%10);
        return 1+(sumof(n));
    }
}
