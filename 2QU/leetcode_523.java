import java.util.HashMap;

public class leetcode_523 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        System.out.println(checkSubarraySum(arr, 3));
    }

    public static int checkSubarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        int presum=0;
        int cnt=0;

        for (int i = 0; i < nums.length; i++) {
            presum+=nums[i];
            int remove=presum-k;
            cnt+=map.getOrDefault(remove, 0);
            map.put(presum, map.getOrDefault(presum, 0)+1);
        }

        return cnt;

    }
}
