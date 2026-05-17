public class leetcode_3184 {
    public static void main(String[] args) {
        int[]hours={12,12,30,24,24};
        System.out.println(countCompleteDayPairs(hours));
    }
     public static int countCompleteDayPairs(int[] hours) {
            int cnt=0;
        for (int i = 0; i < hours.length-1; i++) {
            for (int j = i+1; j < hours.length; j++) {
                // System.out.println(hours[i]+hours[j]);
                if((hours[i]+hours[j])%24==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
