public class leetcode_1653 {
    public static void main(String[] args) {
        String s = "aababbab";
        System.out.println(minimumDeletions(s));
    }

    public static int minimumDeletions(String s) {
int bCount = 0;
        int deletions = 0;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                bCount++;
            } else { // c == 'a'
                deletions = Math.min(deletions + 1, bCount);
            }
        }
        return deletions;
    }
}