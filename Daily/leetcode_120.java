import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode_120 {

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(Arrays.asList(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3, 4)));
        triangle.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));

        minimumTotal(triangle);

        // Print the triangle after sorting
        System.out.println("After sorting: " + triangle);
    }

    static void minimumTotal(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            Collections.sort(row); // sort each row
        }
        // System.out.println("Sorted inside function: " + triangle);
                List<Integer> firstElements = new ArrayList<>();

        for (List<Integer> row : triangle) {
            if (!row.isEmpty()) {
                firstElements.add(row.get(0)); // get first element
            }
        }

        // System.out.println(firstElements);
        int ans=0;

                Integer[] array = firstElements.toArray(new Integer[0]);

            for (int i = 0; i < array.length; i++) {
                ans=ans+array[i];
            }
            System.out.println(ans);
    }
}
