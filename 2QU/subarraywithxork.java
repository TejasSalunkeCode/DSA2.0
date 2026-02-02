import java.util.HashMap;

public  class subarraywithxork {
    public static void main(String[] args) {
        int[]arr={4,2,2,6,4};
        int k=6;

        System.out.println(subbarraywithXork(arr, k));
    }

    public static int subbarraywithXork(int[]a,int k){
        int xr=0;;
        int cnt=0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < a.length; i++) {
            xr=xr^a[i];
            int x=xr^k;
            cnt+=map.getOrDefault(x, 0);

            map.put(xr, map.getOrDefault(xr, 0)+1);
        }
        return cnt;

    }
}
