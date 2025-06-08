// package QU;

// public class leetcode_9 {
//     public static void main(String[] args) {
//         System.out.println(isPali(121));
//     }
//     static boolean isPali(int x){
//         System.out.println("heool");
//       int n=x;
//       int revNum=0;

//       while (n>0) {
//         int d=n%10;
//         revNum=revNum*10+d;
//         n=n/10;
//       }
//       if(revNum==x){
//         return true;
//       }else{
//         return false;
//       }
// }
// }package Problems;

public class leetcode_9 {
    public static void main(String[] args) {
        System.out.println(isPali(1121));
    }
    static boolean isPali(int n){
        if(n<0){
            return false;
        }
        int original_num=n;
        int rev=0;
        while (n>0) {
            int rem=n%10;
            rev=rev*10+rem;
             n=n/10;
        }
        if(rev==original_num){
            return true;
        }
        return false;
    }
}


