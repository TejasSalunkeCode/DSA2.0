public class leetcode_1518 {
    public static void main(String[] args) {
        int numBottles = 15, numExchange = 4;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }

    static int numWaterBottles(int numBottles, int numExchange) {
       int ans=numBottles;
       int newBottle=0;
       int ReamaningBottle=0;
        while (numBottles>=numExchange) {
            newBottle=numBottles/numExchange;
            ReamaningBottle=numBottles%numExchange;
            numBottles=newBottle+ReamaningBottle; 
            ans=ans+newBottle; 
            // System.out.println(ans);
        }
        return ans;
    }

}