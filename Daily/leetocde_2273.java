import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import _42_oop.customArrayList;

public class leetocde_2273 {
    public static void main(String[] args) {
        String[] words = { "abba", "baba", "bbaa", "cd", "cd" };
        System.out.println(removeAnagrams(words));
    }

    public static List<String> removeAnagrams(String[] words) {
        int curr=1;
        int prev=0;
        List<String> list1 = new ArrayList<>();
        list1.add(words[0]);
        while (curr<words.length) {
            if(!isAnagram(words[curr],words[prev])){
                list1.add(words[curr]);
                prev=curr;
            }
            curr=curr+1;
        }
        return list1;
    }
    private static boolean isAnagram(String w1,String w2){
        char[]a=w1.toCharArray();
        char[]b=w2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
