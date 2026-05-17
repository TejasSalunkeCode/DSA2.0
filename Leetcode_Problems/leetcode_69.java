public class leetcode_69 {
    public static void main(String[] args) {
        int x = 2147483647;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        int length=x/2;
        for (int i = 1; i <=length; i++) {
            if(i*i==x){
                return i;
            }
            if(i*i>x){
                return i-1;
            }
        }
        return -1;
    }
}
