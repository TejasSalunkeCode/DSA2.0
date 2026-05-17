import java.util.HashMap;

public class leetode_560 {
    public static void main(String[] args) {
        
    }

     public static int subarraySum(int[] nums, int k) {
        HashMap<Long,Integer> preSum = new HashMap<>();
        long sum=0;
        int maxLen=0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            if(sum==k){
                maxLen=Math.max(maxLen, i+1);
            }
            long rem = sum-k;
            if(preSum.containsKey(rem)){
                int len=i-preSum.get(rem);
                maxLen=Math.max(maxLen, len);
            }

            preSum.putIfAbsent(sum, i);
        }
        return maxLen;
    }
}
