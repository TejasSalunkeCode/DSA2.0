import java.util.ArrayList;

public class LeetCode_17 {
    public static void main(String[] args) {
        pad("", "12");
        // ArrayList<String> ans = padRet("", "12");
        System.out.println(padRet("", "12"));
        System.out.println(padRetCount("", "12"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';// this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));

        }
    }

    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';// this will convert '2' into 2
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> ans2 = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans = padRet(p + ch, up.substring(1));
            ans2.addAll(ans);

        }
        return ans2;
    }

    static int padRetCount(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';// this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padRetCount(p + ch, up.substring(1));
            // ans2.addAll(ans);

        }
        return count;
    }
}
