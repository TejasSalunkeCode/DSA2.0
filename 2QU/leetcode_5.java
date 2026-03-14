public class leetcode_5 {
    public static void main(String[] args) {
        String str = "b";
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        String str = s.substring(0, s.length());
        if(s.length()==1){
            return s;
        }
        System.out.println(s.substring(0, 1));
        int max = 0;
        String ans = "";
        String suString = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                suString = s.substring(i, j);
                if(isPalindrome(suString)){
                if(suString.length()>max){
                max=suString.length();
                ans=suString;
                }
                System.out.println(ans);
                }
                // System.out.println(suString);
                suString = "";
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}