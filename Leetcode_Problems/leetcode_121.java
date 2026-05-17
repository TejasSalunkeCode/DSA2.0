public class leetcode_121 {
    public static void main(String[] args) {
        int[]arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int max=0;

        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                max=Math.max(max, prices[j]-prices[i]);
            }
        }
        return max;
    }
}
