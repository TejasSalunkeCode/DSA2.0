public class reversenum {

    public static void main(String[] args) {
        // System.out.println(345);
        // System.out.println(recursive(345));
        recursive(563);
        System.out.println(sum);
        System.out.println(recursive2(274));
        //System.out.println(pali(sum));
        System.out.println(pali(3456));
    }



    //Meathod 1
    static int sum = 0;
    static void recursive(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        recursive(n / 10);
    }


    //Meathod 2
    static int recursive2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10, digits-1);
    }

    static boolean pali(int n){
        return n==recursive2(n);
    }
}
