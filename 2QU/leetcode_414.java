import java.util.Arrays;
import java.util.Stack;

public class leetcode_414 {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 1 };
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums) {
        Stack<Integer> s1 = new Stack<>();
        Arrays.sort(nums);
        if (nums.length < 3) {
            return nums[nums.length - 1];
        }
        s1.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (s1.peek() != nums[i]) {
                s1.push(nums[i]);
            }
        }
        if(s1.size()<3){
            return s1.peek();
        }
        s1.pop();
        s1.pop();

        return s1.peek();
    }
}
