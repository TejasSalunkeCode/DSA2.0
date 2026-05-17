import java.lang.reflect.Array;


public class leetcode_191 {
    public static void main(String[] args) {
        int n=11;
        System.out.println(hammingWeight(n));
    }
      static int hammingWeight(int n) {
        String binary="";
        int count=0;
        while (n>0) {
            binary=n%2+binary;
            n=n/2;
        }
        System.out.println(binary.length());
        System.out.println(binary.charAt(0));
        System.out.println(binary);
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i)=='1'){
                count=count+1;
            }
        }
        return count;
    }
}
