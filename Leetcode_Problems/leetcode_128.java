import java.util.Arrays;

public class leetcode_128 {
    public static void main(String[] args) {
        int[] arr = { 1,0,1,2 };
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cnt=1,i=0,j=1,max=0;
        boolean flag=true;
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;

        while (flag==true) {
            if(j<nums.length){
                if(nums[j]-nums[i]==0){
                    i++;
                    j++;
                    continue;
                }
                if(nums[j]-nums[i]==1){
                    cnt++;
                    max=Math.max(max, cnt);
                }else{
                    cnt=1;
                }
                i++;
                j++;
            }else{
                flag=false;
            }
            
        }

        return max;

    }

}
