public class leetcode_1306b {
    public static void main(String[] args) {
        int[] arr = {4,2,3,0,3,1,2};
        int start = 5;
        System.out.println(canReach(arr,start));
    }

    public static boolean canReach(int[] arr, int start) {
        if (arr[start] == 0) {
            return true;
        }
        int inc = start;
        int left =inc- arr[start];
        int right = inc+arr[start];

        while (left >= 0 && right < arr.length) {

            if (left >= 0) {
                if(arr[left]==0){
                    return true;
                }
            }
            if(right<arr.length){
                if(arr[right]==0){
                    return true;
                }
            }

            left=left-arr[left];
            right=right+arr[right];
            System.out.println("hel");
        }
        return false;
    }
}