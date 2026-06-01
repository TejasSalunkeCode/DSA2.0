import java.util.HashSet;

public class leetcode_3121 {
    public static void main(String[] args) {
        String word = "aaAbcBC";
        System.out.println(numberOfSpecialChars(word));
    }

    public static int numberOfSpecialChars(String word) {
        if (word.length() < 2) {
            return 0;
        }
        int ans=0;
        
        HashSet<Character> set1 = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            int right=word.length()-1;
            int cnt=0;
            int cnt2=0;
            if(!set1.contains(word.charAt(i)) && (int)word.charAt(i)>=97){
                set1.add(word.charAt(i));
                while (i!=right) {
                    int chl=(int)word.charAt(i);
                int chr=(int)word.charAt(right);
                if(chl-chr==32){
                    cnt++;
                }
                if(chl-chr==0 && cnt>=0){
                    cnt2++;
                    break;
                }
                // if(chl-chr==0 && cnt==0){
                //     break;
                // }
                right--;
            }
            if(cnt>0 && cnt2==0){
                ans++;
            }
            System.out.println("fir : "+cnt);
            System.out.println("sec : "+cnt2);
            
        }

        }
        return ans;
    }
}
