public class leetcode_27 {
    public static void main(String[] args) {
        int []nums={3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }
    static int removeElement(int[] nums, int val) {
    int ans=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[ans]=nums[i];
           ans++;
        }
    }
     return ans;
    }
}
