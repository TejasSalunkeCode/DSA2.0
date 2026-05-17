public class leetcode_441 {
    public static int arrangeCoins(int n) {
        int rows = 0;
        for (int i = 1; i <= n; i++) {
            n -= i;   // subtract coins for the current row
            rows++;   // completed one row
        }
        return rows;
    }

    public static void main(String[] args) {
        int n = 8; // Example input
        int result = arrangeCoins(n);
        System.out.println("Number of complete rows: " + result);
    }
}
