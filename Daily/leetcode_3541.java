public class leetcode_3541 {
    public static void main(String[] args) {
        String s = "successes";
        System.out.println(maxFreqSum(s));  // Expected: 6
    }

    static int maxFreqSum(String s) {
        int[] freq = new int[26]; 
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxVowel = 0;
        int maxConsonant = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char c = (char) (i + 'a');
                if (isVowel(c)) {

                    
                    maxVowel = Math.max(maxVowel, freq[i]);
                } else {
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }
        }

        return maxVowel + maxConsonant;
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
