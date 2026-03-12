import java.util.HashMap;

public class leetcode_3 {
    public static void main(String[] args) {
        String s = "jbpnbwwd";
        System.out.println(lengthOfLongestSubstring(s));
    }
     public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int cnt=0;
        int val=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(map.containsKey(s.charAt(j))){
                    cnt=0;
                    val=0;
                    map.clear();
                }else{
                    cnt++;
                    map.put(s.charAt(j), val+1);
                }
                System.out.println(map);
                max=Math.max(max, cnt);
            }
            map.clear();
            cnt=0;
        }
        return max;
    }
}
