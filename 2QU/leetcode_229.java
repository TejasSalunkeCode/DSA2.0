import java.util.ArrayList;
import java.util.List;

public class leetcode_229 {

    public static void main(String[] args) {
        int[] arr = {2,2};
        System.out.println(majorityElement(arr));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int size = nums.length / 3;
        List<Integer> list = new ArrayList<>();

        if (nums.length == 1 || nums.length == 2) {
            for (int i=0;i<nums.length;i++) {
               if(!list.contains(nums[i])){
                    list.add(nums[i]);
                }
            }
            return list;
        }

        int cnt=1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt>size){
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                }
            }
            cnt=1;
        }

        return list;
    }

}
