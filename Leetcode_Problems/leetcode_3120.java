import java.util.HashSet;

public class leetcode_3120 {
    public static void main(String[] args) {
        String word = "AC";
        System.out.println(numberOfSpecialChars(word));
    }

    public static int numberOfSpecialChars(String word) {
        HashSet<Character> set1 = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!set1.contains(word.charAt(i))) {
                set1.add(word.charAt(i));
            }
        }
        for (int i = 0; i < set1.size(); i++) {
            if (set1.contains(word.charAt(i)) && set1.contains(Character.toUpperCase(word.charAt(i)))) {
                cnt++;
            }
        }
        System.out.println(set1);
        return cnt/2;
    }
}