public class fiboformula {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    static int fibo(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }

    static int fib2(int n){
        if(n<2){
            return n;
        }
        return fib2(n-1)+fib2(n-2);
    }
}
