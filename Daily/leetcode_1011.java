import java.util.Arrays;

public class leetcode_1011 {
    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int capacity = Arrays.stream(weights).max().getAsInt();
        int high = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
        }

        // System.out.println(high);

        for (int i = capacity; i < high; i++) {
            for (int j = 0; j < weights.length; j++) {
                if (sum <= capacity) {
                    sum = sum + weights[j];
                }else{
                    j=j-1;
                    count++;
                    sum=0;
                }
            }
            if(count<=days){
                return capacity;
            }
        }

        return capacity;

    }
}
