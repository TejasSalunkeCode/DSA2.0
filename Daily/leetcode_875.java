import java.util.Arrays;

public class leetcode_875 {
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int max=piles[piles.length-1];
        System.out.println(max);
        int ans=0;

        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < piles.length; j++) {
                if(piles[j]%i==0){
                    ans=ans+piles[j]/i;            
                }else{
                    ans=(ans+piles[j]/i);
                    ans=ans+1;
                }
            }
            System.out.println(ans);
            if(ans==h){
                return i;
            }
            if(ans>h){
                ans=0;
                // return 0;
            }
        }

        return ans;
    }
}
