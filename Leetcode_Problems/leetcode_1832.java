public class leetcode_1832 {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyy";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int cnt=0;
        System.out.println(sentence.length());
        char ch='a';
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < sentence.length(); j++) {
                if(sentence.charAt(j)==ch){
                    ch++;
                    cnt++;
                    System.out.println(ch);
                    break;
                }
            }
        }
        if(cnt==26){
            return true;
        }else{
            return false;
        }
    }
}
