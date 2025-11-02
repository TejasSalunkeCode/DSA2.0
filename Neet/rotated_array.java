package Neet;

public class rotated_array {
    public static void main(String[] args) {
        int []nums = {3,4,5,6,1,2};
        int target = 1;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
