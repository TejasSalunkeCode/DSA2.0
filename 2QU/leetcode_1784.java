public class leetcode_1784 {
    public static void main(String[] args) {
        String s = "111111000000";
        System.out.println(checkOnesSegment(s));
    }

    public static boolean checkOnesSegment(String s) {
        if (s.length() == 1 && s.charAt(0) == '1') {
            return true;
        }
        int i = 0;
        int cnt1 = 0, cnt2 = 0;
        boolean flag = true;
        while (flag) {
            if (s.charAt(i) == '1') {
                cnt1++;
            } else {
                if (cnt1 != 0) {
                    cnt2++;
                    cnt1 = 0;
                }
            }
            i++;
            if (i == s.length() - 1 && s.charAt(s.length() - 1) == '1') {
                cnt2++;
            }
            if (i >= s.length()) {
                flag = false;
            }
        }
        if (cnt2 > 1) {
            return false;
        }
        return true;
    }
}