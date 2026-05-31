import java.util.Arrays;

public class leetcode_2126{
    public static void main(String[] args) {
        int mass = 10;
        int[] asteroids = {10};
        System.out.println(asteroidsDestroyed(mass, asteroids));
    }
     public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        
        Arrays.sort(asteroids);
        int ans=mass;
        for (int i = 0; i < asteroids.length; i++) {
            if(ans<asteroids[i]){
                return false;
            }
            ans=ans+asteroids[i];
        }
        return true;

    }
}