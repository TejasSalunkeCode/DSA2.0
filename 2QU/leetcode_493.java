public class leetcode_493 {
    public static void main(String[] args) {
        int[]arr={2,4,3,5,1};
        System.out.println(reversePairs(arr));
    }
     public static int reversePairs(int[] nums) {
        int cnt=0;
        for (int i = nums.length-1; i >0; i--) {
            for (int j = i-1; j >=0; j--) {
                if(nums[i]*2<nums[j]){
                    cnt++;
                }
            }
        }   
        return cnt;
    }
}
