public class leetcode_3818 {
    public static void main(String[] args) {
        int[] arr = {1,-1,2,3,3,4,5 };
        System.out.println(minimumPrefixLength(arr));
    }

    public static int minimumPrefixLength(int[] nums) {
        boolean flag = true;
        int i=0,j=1;
        int cnt=0;
        while (flag == true) {
            if(nums[i]<nums[j]){
                cnt++;
            }else{
                cnt=0;
            }
            i++;
            j++;
            if (j>nums.length-1) {
                flag=false;
            }
        }
        if(cnt==0){
            return nums.length-1;
        }
        cnt+=1;
        return nums.length-cnt;
    }
}
