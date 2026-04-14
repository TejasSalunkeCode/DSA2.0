import java.util.ArrayList;
import java.util.List;

public class leetcodee_78 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(nums, list, 0, result);
        return result;
    }

    public static void solve(int[] nums, List<Integer> list, int i, List<List<Integer>> result) {
        // Base case
        if (i >= nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        // Include the current element
        list.add(nums[i]);
        solve(nums, list, i + 1, result);
        System.out.println(list);
        // Backtrack (remove the last added element)
        list.remove(list.size() - 1);

        // Exclude the current element
        solve(nums, list, i + 1, result);
    }
}