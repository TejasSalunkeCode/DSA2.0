import java.util.Arrays;

// import Interface.breake;

public class testing {
    public static void main(String[] args) {
        String str = "zxyzxyz";
        System.out.println(lengthOfLongestSubstring(str));
    }

    static int lengthOfLongestSubstring(String s) {

        // char[]ch=s.toCharArray();
        // System.out.println(Arrays.toString(ch));
        int count=0;
        String str="";

        for (int i = 1; i < s.length(); i++) {
            //  if(ch[i]!=ch[0]) break;
            if(s.charAt(i)!=s.charAt(0)) {
                count++;
            }else{
                break;
            }
        }

        return count+1;
    }
}

