public class leetcode_2348 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 0, 0, 2, 0, 0, 4 };
        System.out.println(zeroFilledSubarray(arr));
    }

    static long zeroFilledSubarray(int[] nums) {
        long result=0;
        long count=0;

        for(int num :nums){
            if(num==0){
                count++;
                result+=count;
            }else{
                count=0;
            }
        }

        return result;

    }
}
