public class leetcode_3100 {
    public static void main(String[] args) {
        int numBottles = 13, numExchange = 13;
        System.out.println(maxBottlesDrunk(numBottles, numExchange));
    }
    static int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numExchange;
        if(numBottles<numExchange) return numBottles;
        if(numBottles==numExchange) return numBottles+1;
        while (numBottles>=numExchange) {
            if(numBottles==numExchange) return ans+1;
           numBottles=(numBottles-numExchange)+1;
           numExchange++;
        //    System.out.println(ans);
        if(numExchange<=numBottles){
            ans=ans+numExchange;
        }
        }

        return ans+numBottles;
    }
}
