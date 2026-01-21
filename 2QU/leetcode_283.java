import java.util.Arrays;
import java.util.Stack;

public class leetcode_283 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        Stack s1 = new Stack<>();
        int [] temp=new int[nums.length];
        int j=0;
        for (int i = 0; i < temp.length; i++) {
            if(nums[i]!=0){
                temp[j]=nums[i];
                j++;
            }else{
                s1.push(nums[i]);
            }
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i]=temp[i];
        }
        // System.out.println(Arrays.toString(temp));
    }

}
