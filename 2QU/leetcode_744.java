public class leetcode_744 {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int val;
        int tar=(int)target;
        for (int i = 0; i < letters.length; i++) {
            val=(int)letters[i];
            if(val>tar){
                return letters[i];
            }
            System.out.println(val);

        }

        return letters[0];
    }
}
