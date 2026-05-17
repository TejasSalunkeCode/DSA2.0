public class leetcode_396 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 6 };
        System.out.println(maxRotateFunction(arr));
    }

    public static int maxRotateFunction(int[] nums) {
        int sum = 0,n=nums.length,f0=0;

        for (int i = 0; i < n; i++) {
            sum+=nums[i];
            f0+=i*nums[i];
        }

        int maxfn=f0;
        int prevfn=f0;

        for (int i = n-1; i >0; i--) {
            int num=nums[i];

            int nextFn=prevfn+sum-n*num;

            maxfn=Math.max(maxfn, nextFn);
            prevfn=nextFn;
        }

        
        return maxfn;
    }
}
