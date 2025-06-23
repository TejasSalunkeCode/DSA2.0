// import java.lang.reflect.Array;
import java.util.Arrays;

public class check22 {
    public static void main(String[] args) {
        int[] matrix = { 1,2,3 };
        int[] ans=plusOne(matrix);
        System.out.println((Arrays.toString(ans)));
    }

    static int[] plusOne(int[] digits) {
        int []ans=new int[digits.length];
        // System.out.println(Arrays.toString(ans));
        for (int i = digits.length; i > 0; i--) {
            // // System.out.print(digits[i]);
            // if(digits[i]==digits.length-1){
            // ans[i]=digits[i+1];
            //     System.out.println("hh");
            // }
            ans[i]=digits[i];
        }
        return ans;
    }
}
