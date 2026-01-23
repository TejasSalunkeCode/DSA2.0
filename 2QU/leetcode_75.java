import java.util.Arrays;

public class leetcode_75 {
    public static void main(String[] args) {
        int[]nums={2,0,2,1,1,0};
        sortColors(nums);
    }
      public static void sortColors(int[] nums) {
        int cnt=0,cnt1=0,cnt2=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                cnt++;
            }else if(nums[i]==1){
                cnt1++;
            }else if(nums[i]==2){
                cnt2++;
            }
        }
        System.out.println(cnt);
        System.out.println(cnt1);
        System.out.println(cnt2);

        for (int i = 0; i < nums.length; i++) {
            if(cnt!=0){
                nums[i]=0;
                cnt--;
            }else if(cnt1!=0){
                nums[i]=1;
                cnt1--;
            }else if(cnt2!=0){
                nums[i]=2;
                cnt2--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
