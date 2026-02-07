import java.util.Arrays;

public class leetcode_34 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        int[]res=searchRange(arr,2);
        System.out.println(Arrays.toString(res));
        // System.out.println(searchRange(arr, 8));
    }
     public static int[] searchRange(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int[]arr=new int[2];
        if(nums.length==1 && nums[0]==target){
            return new int[]{0,0};
        }
        if(nums.length==1 && nums[0]!=target){
            return new int[]{-1,-1};
        }
        boolean flag=true;
        boolean flag2=true;
        while (i<=j) {
            if(flag2==true && nums[i]==target){
                arr[0]=i;
                flag2=false;
            }
            if(flag==true && nums[j]==target){
                arr[1]=j;
                flag=false;
            }
            if(i==j && flag==true && flag2==true){
                return new int[]{-1,-1};
            }
            if(flag2){
                i++;
            }
            if(flag){
                j--;
            }
            if(flag==false && flag2==false){
                return arr;
            }
        }

        return new int[]{-1,-1};
    }
}
