import java.util.Arrays;

public class missingNrepe {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 3};

        int[] result = findMissingRepeatingNumbers(arr);
        System.out.println(Arrays.toString(result));
        // System.out.println("Repeating number: " + result[0]);
        // System.out.println("Missing number: " + result[1]);
    }

    public static int[] findMissingRepeatingNumbers(int[] arr) {
        int n = arr.length;
        int[] hash = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        int repeating = -1, missing = -1;

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) {
                repeating = i;
            } else if (hash[i] == 0) {
                missing = i;
            }

            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        return new int[] { repeating, missing };

    }
}
