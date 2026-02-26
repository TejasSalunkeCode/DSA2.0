package String;

public class leetcode_1704 {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        int len1 = s.length() / 2 - 1;
        // int len2=s.length()-len1;
        // System.out.println(len1);
        // System.out.println(len2);
        int cnt1=0,cnt2=0;
        for (int i = 0; i <= len1; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                        cnt1++;
            }
        }
        for (int i = len1+1; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                        cnt2++;
            }
        }
        if(cnt1==cnt2){
            return true;
        }
        return false;
    }
}
