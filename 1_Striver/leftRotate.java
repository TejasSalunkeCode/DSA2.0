import java.util.Arrays;

public class leftRotate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        rotateLeft(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] rotateLeft(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
}
