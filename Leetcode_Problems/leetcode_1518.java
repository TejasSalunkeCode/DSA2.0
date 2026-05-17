public class leetcode_1518 {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
    }
     static int numWaterBottles(int numBottles, int numExchange) {
        int original = numBottles;
        int ans = 0;
        ans = ans + original;
        while (original >= numExchange) {
            int rem = original % numExchange;
            int newbottle =original / numExchange;
            ans = ans + newbottle;
            original = original / numExchange;
            original+=rem;
        }
        return ans;
    }
}
