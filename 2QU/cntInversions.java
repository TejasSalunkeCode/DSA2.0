public class cntInversions{
    public static void main(String[] args) {
        int[]arr={5,3,2,4,1};
        System.out.println(cntInversion(arr));
    }
    public static int cntInversion(int[]arr){
        int cnt=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}