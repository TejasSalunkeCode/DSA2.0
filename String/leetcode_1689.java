package String;

public class leetcode_1689 {
    public static void main(String[] args) {
        String n = "32";
        System.out.println(minPartitions(n));
    }

    public static int minPartitions(String n) {
        int maxDigit = 0;

        for (char c : n.toCharArray()) {
            maxDigit = Math.max(maxDigit, c - '0');

            // Early stop if we reach 9 (maximum possible)
            if (maxDigit == 9) {
                return 9;
            }
        }

        return maxDigit;
    }
}
