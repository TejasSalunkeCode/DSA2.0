// package _38_oop;
public class leetcode_231 {

public static void main(String[] args) {
    System.out.println(isPowerOfTwo(5));
}
static boolean isPowerOfTwo(int n) {
     if(n<1){
            return false;
        }else if(n==1){
            return true;
        }else{
            while(n%2==0){
                n=n/2;
            }
            if(n==1){
                return true;
            }
            }
            return false;         
}
}