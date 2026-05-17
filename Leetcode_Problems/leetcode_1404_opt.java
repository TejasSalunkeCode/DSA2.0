public class leetcode_1404_opt {
    public static void main(String[] args) {
        String s = "1010";
        System.out.println(numSteps(s));
    }

    public static String addOne(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = sb.length() - 1;

        while (i >= 0 && sb.charAt(i) != '0') {
            sb.setCharAt(i, '0');
            i--;
        }

        if (i < 0) {
            sb.insert(0, '1');
        } else {
            sb.setCharAt(i, '1');
        }

        return sb.toString();
    }

    public static int numSteps(String s) {
        int op = 0;
        while (s.length() > 1) {
            int n = s.length();
            if (s.charAt(n - 1) == '0') {
                s = s.substring(0, n - 1);  // ✅ assign the result
            } else {
                s = addOne(s);              // ✅ capture return value
            }
            op++;
        }
        return op;
    }
}