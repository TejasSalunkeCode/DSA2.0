public class leetcode_852 {
    public static void main(String[] args) {
        int[] arr = {1,1000000,2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int a = 0, b = 1, c = 2;
        boolean flag = true;
        while (flag==true) {
            if (arr[a] < arr[b] && arr[b] > arr[c]) {
                return b;
            }
            if (c != arr.length) {
                a++;
                b++;
                c++;
            } else {
                flag = false;
            }
        }
        return -1;
    }
}
