public class leetcode_2211 {

    public static void main(String[] args) {
        String directions = "RLRSLL";
        System.out.println(countCollisions(directions));
    }

    public static int countCollisions(String directions) {
        int n = directions.length();
        int left = 0, right = n - 1;

        while (left < n && directions.charAt(left) == 'L') {
            left = left + 1;
        }

        while (right >= 0 && directions.charAt(right) == 'R') {
            right = right - 1;
        }
        int collisons = 0;
        for (int i = left; i <= right; i++) {
            if(directions.charAt(i)!='S'){
                collisons+=1;
            }
        }
        return collisons;
    }
}
