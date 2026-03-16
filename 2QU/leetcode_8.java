public class leetcode_8 {

    public static void main(String[] args) {
        String str = " -042";
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        int num = 0;
        int n = s.length();

        // 1. Skip spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // 3. Read digits
        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // 4. Check overflow
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }
}