import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_2751 {
    public static void main(String[] args) {
        int[] positions = { 3, 5, 2, 6 };
        int healths[] = { 10, 10, 15, 12 };
        String directions = "RLRL";
        System.out.println(survivedRobotsHealths(positions, healths, directions));
    }

    public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> ans = new ArrayList<>();
        String newDir = "";
        int[] sortedPositions = new int[positions.length];
        for (int i = 0; i < sortedPositions.length; i++) {
            sortedPositions[i] = positions[i];
        }
        Arrays.sort(sortedPositions);
        System.out.println(Arrays.toString(sortedPositions));

        int[] sortedHealth = new int[healths.length];
        boolean flag = true;
        int i = 0;
        int k = 0;
        int m = 0;
        System.out.println(directions);
        while (flag) {
            if (sortedPositions[m] == positions[i]) {
                sortedHealth[k] = healths[i];
                newDir += directions.charAt(i);
                System.out.println(Arrays.toString(sortedHealth));
                i++;
                k++;
                m++;
            } else {
                i++;
            }
            if (k == sortedPositions.length) {
                flag = false;
            }
            if (i == sortedPositions.length) {
                i = 0;
            }
        }
        System.out.println(newDir);
        boolean flag2 = true;
        int p1 = 0, q1 = p1 + 1;
        while (flag2) {
            if (newDir.charAt(p1) == 'R' && newDir.charAt(q1) == 'L') {
                
            }
        }

        return ans;
    }

}