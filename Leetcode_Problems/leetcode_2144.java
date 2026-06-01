import java.util.Arrays;

public class leetcode_2144{
    public static void main(String[] args) {
        int[] cost ={14, 12, 5, 2};
        System.out.println(minimumCost(cost));
    }
     public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        System.out.println(Arrays.toString(cost));
        int val=0;
        int sum=0;
        int cnt=0;
        for (int i = cost.length-1; i >= 0 ; i--) {
            if(cnt!=2){
                sum=sum+cost[i];
            }
            cnt++;
            if(cnt==3){
                if(sum>=cost[i]){
                    val=val+sum;
                    sum=0;
                    cnt=0;
                }
            }
        }
        if(sum>0){
            return val+sum;
        }
        return val;
    }
}