import java.util.Arrays;

public class leetcode_1984 {
    public static void main(String[] args) {
       int[] nums ={9,4,1,7};
       //1 4 7 9
        int k = 2;
        System.out.println(minimumDifference(nums, k));
    }

    public static int minimumDifference(int[] nums, int k) {
        int ans=0,min = Integer.MAX_VALUE;
        boolean flag=true;
        int i=0,j=k-1;
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        
        while (flag==true) {
            ans=nums[j]-nums[i];
            System.out.println(ans);
            min=Math.min(ans, min);

            if(i+1!=nums.length && j+1!=nums.length){
                j++;
                i++;
            }else{
                flag=false;
            }
        }

        return min;
    }
}
