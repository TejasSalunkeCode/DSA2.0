public class leetcode_704 {
    public static void main(String[] args) {
        int[] nums = { 2,5 };
        int target = 5;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                s=mid+1;
            } else {
                e=mid-1;
            }
            
        }
        return -1;

    }
}