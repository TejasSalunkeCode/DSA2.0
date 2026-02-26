import java.util.Arrays;

public class mostfreq2 {
    public static void main(String[] args) {
        String s = "charactrer";
        System.out.println(getMaxOccuring(s));
    }

    public static char getMaxOccuring(String s) {
        char []charr=s.toCharArray();
        Arrays.sort(charr);
        System.out.println(charr);
        int j = 0,i=0;
        char ch = s.charAt(0);
        int cnt=0;
        int max=0;
        boolean flag = true;
        while (flag) {
            if(charr[i]!=charr[j]){
                cnt=j-i;
                if(cnt>max){
                    ch=charr[i];
                }
                max=Math.max(max,cnt);
                i=j;
            }
            j++;
            if(j>s.length()-1){
                flag=false;
            }
        }
        return ch;
    }
}
