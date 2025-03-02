public class SetBits {
    public static void main(String[] args) {
        int n=3;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(SetBitss(n));
    }
    public static int SetBitss(int n){
        int count=0;

        while (n>0) {
            count++;
            n=n & (n-1);
        }
        return count;
    }
}
