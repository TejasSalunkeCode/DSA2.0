public class leetcode_3121 {
    public static void main(String[] args) {
       String word = "aaAbcBC";
       System.out.println(numberOfSpecialChars(word));
    }
     public static int numberOfSpecialChars(String word) {
        if(word.length()<2){
            return 0;
        }
        int cnt=0;
        for (int i = 0; i < word.length(); i++) {
            int left=0;
        
            int right=word.length()-1;
    
            while (left!=right) {
                int chl=(int)word.charAt(left);
                int chr=(int)word.charAt(right);
                if(chl-chr==0 && chl>=97){
                    break;
                }
                if(chl-chr==32){
                    cnt++;
                }
            }
        }
    }
}
