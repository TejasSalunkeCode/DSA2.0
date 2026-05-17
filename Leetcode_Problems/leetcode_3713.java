import java.util.Arrays;
import java.util.HashSet;

public class leetcode_3713 {
    public static void main(String[] args) {
        String str = "zzabccy";
        System.out.println(longestBalanced(str));
    }

    public static int longestBalanced(String s) {
        int n = s.length();
        int maxlen = 0;
        for (int i = 0; i < n; i++) {
            int freq[] = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                if ((j - i + 1) > maxlen && checkbalance(freq)) {
                    maxlen = j - i + 1;
                }
            }
        }
        return maxlen;
    }

    static boolean checkbalance(int freq[]) {
        int expect = 0;
        for (int f : freq) {
            if (f == 0)
                continue;
            if (expect == 0)
                expect = f;
            else if (f != expect)
                return false;
        }
        return true;
    }

}
