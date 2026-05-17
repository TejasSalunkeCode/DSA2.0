
public class leetcode_162 {
    public static void main(String[] args) {
        int []nums={1,2,3,4,8,6,1};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int ans=-2;
        if(nums.length==1) return 0;
        if(nums.length==2) {
            if(nums[0]>=nums[1]){
                return 0;
            }else{
                return 1;
            }
        }

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[j]>nums[i] && nums[j]>nums[k]){
                        ans = j;
                    }
                    break;
                }
                break;
            }
        }
        if(ans>-1){
            return ans;
        }
        if(nums[0]>nums[nums.length-1]){
            return 0;
        }
        return nums.length-1;
    }
}
