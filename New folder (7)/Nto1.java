public class Nto1 {
    public static void main(String[] args) {
        // fun(5);
        // funreverse(8);
        concept(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("hello");
        System.out.println(n);
        fun(n - 1);
    }
    static void funreverse(int n) {
        if (n == 0) {
            return;
        }
        funreverse(n - 1);
        System.out.println("hi");
        System.out.println(n);
    }

    static int concept(int n){
        if(n==0){
            return n;
        }
        System.out.println(n);
        return concept(--n);
    }
}
