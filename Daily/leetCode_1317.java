import java.util.Arrays;

public class leetCode_1317 {
    public static void main(String[] args) {
        int n=11;
        System.out.println(getNoZeroIntegers(Arrays.toString(n)));
    }

    static int[] getNoZeroIntegers(int n) {
         if (n > 2) {
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n - 1; j++) {
                    if (i + j == n) {
                        return new int[] { i, j };
                    }
                }
            }
        } else if (n == 1) {
            return new int[] { 1, 1 };
        } 
            return new int[] { 0, 0 };
    }
}

