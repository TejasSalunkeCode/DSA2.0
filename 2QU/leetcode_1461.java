import java.util.Arrays;
import java.util.HashSet;

public class leetcode_1461 {
    public static void main(String[] args) {
        String s = "00110110";
        System.out.println(hasAllCodes(s, 2));
    }

    public static boolean hasAllCodes(String s, int k) {
        HashSet<String> st = new HashSet<>();
        int n = s.length();
        int codes = 1 << k;

        for (int i = k; i <= n; i++) {
            String sub = s.substring(i - k, i);

            if (!st.contains(sub)) {
                st.add(sub);
                codes--;
            }

            if (codes == 0) {
                return true;
            }
        }

        return false;
    }
}
