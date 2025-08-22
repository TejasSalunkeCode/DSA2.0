
public class leetcode_125 {
    public static void main(String[] args) {
        String ops = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(ops));
    }

    static boolean isPalindrome(String s) {
        String noSpa = s.replaceAll("\\s+", "");
        System.out.println(noSpa);
        StringBuffer s1 = new StringBuffer(s);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.charAt(i) != ' ') { // skip spaces
                if (Character.isLetterOrDigit(ch)) {
                    s1.append(ch);
                    s1.append(s.charAt(i));
                }
            }
        }
        s1.reverse();

        System.out.println(s1);

        if (s1.equals(s)) {
            return true;
        }
        return false;
    }
}