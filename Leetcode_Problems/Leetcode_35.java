public class Leetcode_35 {
    public static void main(String[] args) {
        int[]arr={1,3,5,6};
        System.out.println(search(arr, 7));
    }
    static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
                return i;
            }
            if(target<nums[i]){
                System.out.println("hello");
                return i;
            }
        }
        //  if(target>nums.length){
        //         System.out.println("hello6");
        //         return nums.length-1;
        //     }
        return nums.length;
       
    }
}

