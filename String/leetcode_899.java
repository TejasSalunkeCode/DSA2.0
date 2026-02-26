package String;

import java.util.Arrays;

public class leetcode_899 {
    public static void main(String[] args) {
        String s = "cba";
        int k = 1;
        System.out.println(orderlyQueue(s, k));
    }

    public static String orderlyQueue(String s, int k) {
        if (k == 1) {
            String ans = s; // Initialize with original string
            for (int i = 1; i < s.length(); i++) {
                String temp = s.substring(i) + s.substring(0, i); // rotate
                if (temp.compareTo(ans) < 0) { // lexicographically smaller
                    ans = temp;
                }
            }
            return ans;
        } else {
            char[] ch = s.toCharArray();
            Arrays.sort(ch); // sort characters
            return new String(ch);
        }
    }
}