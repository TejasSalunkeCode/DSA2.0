

public class test2 {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            // Manual XOR using: (a OR b) AND NOT (a AND b)
            result = (result | num) & ~(result & num);
        }
        return result;
    }

    // You can test it here
    public static void main(String[] args) {
        test2 sol = new test2();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(sol.singleNumber(nums)); // Output: 4
    }
}