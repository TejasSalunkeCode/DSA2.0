public class AggresiveCows {
    public static void main(String[] args) {
        
    }
    public static boolean canWePlace(int[]stalls,int dist,int cows){
        int cnt=1;
        int last=stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if(stalls[i]-last>=dist){
                cnt++;
                last=stalls[i];
            }
            if(cnt>=cows) return true;
        }
        return false;
    }

    public static int aggressiveCows(int[]stalls,int k){
        int n=stalls.length;
        int low=1,high=stalls[n-1]-stalls[0];

        while (low<=high) {
            int mid=low+(high-low)/2;

            if(canWePlace(stalls, mid, low)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
}
