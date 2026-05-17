// import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode_66 {
    public static void main(String[] args) {
        int[] matrix = { 1,2,3 };
        int[] ans=plusOne(matrix);
        System.out.println((Arrays.toString(ans)));
    }

    static int[] plusOne(int[] digits) {
      for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
