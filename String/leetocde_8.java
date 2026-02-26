package String;

public class leetocde_8 {
    public static void main(String[] args) {
        String s = " -042";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        String res = "";
        if ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            
        }
    }
}
