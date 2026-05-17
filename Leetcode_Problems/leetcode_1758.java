import java.util.Arrays;

public class leetcode_1758 {
    public static void main(String[] args) {
        String s = "000";
        System.out.println(minOperations(s));
    }

    public static int minOperations(String s) {
        char ch[] = s.toCharArray();
        int cnt1 = 0;
        int cnt2 = 0;
        boolean flag = true;
        boolean flag2 = true;
        // Pattern 010
        if (ch.length == 1) {
            return 0;
        }
        int i = 0, j = 1;
        while (flag) {
            if (ch[i] != '0') {
                cnt1++;
            }

            if (j <= s.length() - 1 && ch[j] != '1') {
                cnt1++;
            }
            i = i + 2;
            j = j + 2;
            // if (j >= s.length() && i <= s.length() - 1) {

            // }
            if (j >= s.length() && i >= s.length()) {
                flag = false;
            }
        }

        // Pattern 101

        int k = 0, m = 1;
        while (flag2) {
            if (ch[k] != '1') {
                cnt2++;
            }

            if (m <= s.length() - 1 && ch[m] != '0') {
                cnt2++;
            }
            k = k + 2;
            m = m + 2;

            if (m >= s.length() && k >= s.length()) {
                flag2 = false;
            }
        }

        return Math.min(cnt1, cnt2);

    }
}