public class firstlastindexposition {
    public static void main(String[] args) {
        // int []nums={1,3,4,7,7,7,7,7,9,10};
        // int target=7;
        // int ans2=search(nums, target, true);
        // int ans3=searchrange(nums, target);
      }
    static int[] searchrange(int[] nums, int target){
        int[] ans={-1,-1};
        int start=search(nums, target, true);
        int end=search(nums, target, false);
        
        ans[0]=start;
        ans[1]=end;

        return ans;
    }
    static int search(int []nums, int target,boolean firstlastindex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while (start<=end) {
            int mid=start+(end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }

        }
        return ans;
    }
}
