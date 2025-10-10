import java.util.Arrays;

public class leetcode_3147 {
    public static void main(String[] args) {
        int[] arr = { 2, -1, 3, -4, 5 };
        int k = 2;
        System.out.println(maximumEnergy(arr, k));
    }

    public static int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int ans = Integer.MIN_VALUE;

        System.out.println("Initial energy array: " + java.util.Arrays.toString(energy));
        System.out.println("k = " + k);
        System.out.println("---------------------------");

        for (int i = n - 1; i >= 0; i--) {
            if (i + k < n) {
                energy[i] += energy[i + k];
                System.out.println("Index " + i + ": Can jump to " + (i + k) + ", energy[i] updated to " + energy[i]);
            } else {
                System.out.println("Index " + i + ": Cannot jump, energy[i] = " + energy[i]);
            }

            ans = Math.max(ans, energy[i]);
            System.out.println("Current maximum energy ans = " + ans);
            System.out.println("---------------------------");
        }
        System.out.println("Final maximum energy = " + ans);
        System.out.println(Arrays.toString(energy));
        return ans;
    }
}