import java.util.Arrays;

public class leetcode_2149 {
    public static void main(String[] args) {
        int[] arr = { -1,1};
        System.out.println(rearrangeArray(arr));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int poss=0,neg=1;
        for (int i = 0; i < arr.length; i++) {
            if(nums[i]<0){
                arr[neg]=nums[i];
                neg+=2;
            }else{
                arr[poss]=nums[i];
                poss+=2;
            }
        }
        return arr;

    }
}
