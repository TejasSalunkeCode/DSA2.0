import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_2300 {
    public static void main(String[] args) {
        int[] spells = { 5, 1, 3 };
        int[] potions = { 1, 2, 3, 4, 5 };
        int success = 7;
        int[] arr = successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(arr));
    }

    static int[] successfulPairs(int[] spells, int[] potions, long success) {

        List<Integer> listOfPor = new ArrayList<>();
        int count=0;
        for (int i = 0; i < spells.length; i++) {
            for (int j = 0; j < potions.length; j++) {
                if (spells[i] * potions[j] >= success) {
                    count++;
                }
            }
            System.out.println(count);
            listOfPor.add(count);
            count=0;
        }
        int[] array = listOfPor.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }

}
