public class _8__lletcode {
    public static void main(String[] args) {
        int x=120;
        System.out.println(reverse(x));
    }
     static int reverse(int x) {
          int reversed = 0;
        // int n = Math.abs(num);
         while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
        
}
}
