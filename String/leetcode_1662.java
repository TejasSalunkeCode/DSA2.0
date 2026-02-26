package String;

public class leetcode_1662 {
    public static void main(String[] args) {
        String  []word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
     public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
           ans1=ans1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
           ans2=ans2.append(word2[i]);
        }
        System.out.println(ans1);
        System.out.println(ans2);
        if(ans1.toString().equals(ans2.toString())){
            return true;
        }
        return false;
    }
}
