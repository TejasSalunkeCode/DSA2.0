import java.util.Arrays;
public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {34, 3, 78, -9, 0, 12, 8, 1};
        cyclicc(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicc(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Skip negative values or values out of the valid range
            if (arr[i] < 0 || arr[i] >= arr.length) {
                i++;
                continue;
            }

            int correctIndex = arr[i];

            // Only swap if the element is not already in the correct position
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
