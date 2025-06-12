
public class leetcode_217 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 9 };
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        System.out.println("hello");
        
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
