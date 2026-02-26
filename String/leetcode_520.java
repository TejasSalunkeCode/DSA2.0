package String;

public class leetcode_520 {
    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        int countCapital=0;
         for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) 
                countCapital++;
        }
        if(countCapital==0 || countCapital==word.length() || countCapital==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;


    }
}
