import java.util.Arrays;

public class leetcode_164 {
    public static void main(String[] args) {
        int[]num={1,1,1,1,1,5,5,5,5,5};
        System.out.println(maxgap(num));
    }
    static int maxgap(int[]num){
        Arrays.sort(num);
        int newvalue;        
        int max=0;
        for (int i = 0; i < num.length-1; i++) {
             newvalue=num[i+1]-num[i];
            if(newvalue>max){
                max=newvalue;
                System.out.println(max);
            }
        }

        return max;      

    }
}
