import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_442 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                cnt += 1;
            }
            
            map.put(nums[i], cnt++);
            System.out.println(cnt);
            if(cnt>1){
                list.add(nums[i]);
            }
            cnt = 0;
        }
        System.out.println(map);
        return list;
    }
}
