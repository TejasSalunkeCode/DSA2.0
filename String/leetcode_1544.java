package String;

public class leetcode_1544 {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
 StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // current character
            int len = result.length();

            if (len > 0) {
                char last = result.charAt(len - 1);
                // Check if last and current char are same letter but different case
                if (last + 32 == ch || last - 32 == ch) {
                    result.deleteCharAt(len - 1); // remove last char (pop)
                    continue; // skip adding current char
                }
            }

            result.append(ch); // add current char to result
        }

        return result.toString();
    }
}