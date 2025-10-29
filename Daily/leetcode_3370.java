public class leetcode_3370 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(smallestNumber(n));
    }

    static int smallestNumber(int n) {
        int num=0;
        int i=1;
        // System.out.println(num);
        while (num<=n) {
            num = (int)Math.pow(2, i) - 1;
            if (num>=n) {
                // return num;
                break;
            }
            i++;
        }
        return num;
    }
}
