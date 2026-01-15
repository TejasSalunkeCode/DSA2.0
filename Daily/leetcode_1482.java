public class leetcode_1482 {
    public boolean possible(int[] arr, int day, int m, int k) {
        int cnt = 0;
        int noOfb = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfb += (cnt / k);
                cnt = 0;
            }
        }
        noOfb += (cnt / k);
        return noOfb >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long val = 1L * m * k;
        if(val>bloomDay.length) return -1;
        
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            mini=Math.min(mini, bloomDay[i]);
            maxi=Math.max(maxi, bloomDay[i]);
        }
        int low=mini,high=maxi;
        while (low<=high) {
            int mid=(low+high)/2;
            if(possible(bloomDay, high, mid, k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

}
