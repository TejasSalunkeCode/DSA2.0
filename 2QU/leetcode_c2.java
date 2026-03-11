public class leetcode_c2 {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 2, 2, 5 };
        System.out.println(smallestBalancedIndex(arr));
    }

    public static int smallestBalancedIndex(int[] nums) {
        if (nums.length == 1) {
            return -1;
        }
        int leftsum = 0;
        int Rightproduct = 1;
        int k = -1, m = -1;
        for (int i = 1; i < nums.length; i++) {

            k = i - 1;

            while (k >= 0) {
                leftsum = leftsum + nums[k];
                k--;
            }
            m = i + 1;
            while (m < nums.length) {
                Rightproduct = Rightproduct * nums[m];
                m++;
            }
            if (leftsum == Rightproduct) {
                return i;
            }
            System.out.println(leftsum);
            System.out.println(Rightproduct);
            leftsum = 0;
            Rightproduct = 1;
        }
        return -1;
    }
}
