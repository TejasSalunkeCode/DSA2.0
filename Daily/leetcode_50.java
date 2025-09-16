public class leetcode_50 {
    public static void main(String[] args) {
        double x = 2.00000, n = 10;
        System.out.println(myPow(x, 10));
    }

    static double myPow(double x, int n) {
        double ans=1;
          if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        while (n!=0) {
            ans=ans*x;
            n--;
        }
        return ans;
    }

}
