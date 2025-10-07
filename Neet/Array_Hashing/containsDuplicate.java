package Neet.Array_Hashing;

import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int []arr={1,2,2,3,4,5};
        System.out.println(hasDuplicate(arr));
    }
     static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for(int num : nums){
            if(seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}
