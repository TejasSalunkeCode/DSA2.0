public class leetcode_485 {
    public static void main(String[] args) {
        int[]arr={1,1,1,0,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
     public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0,prevCnt=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
                prevCnt=Math.max(prevCnt, count);
            }else{
                count=0;
            }
        }

        return prevCnt;
    }
}
