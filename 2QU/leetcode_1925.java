public class leetcode_1925 {

    public static void main(String[] args) {
        int n=5;
        System.out.println(countTriples(n));
    }

    public static int countTriples(int n) {
        boolean flag=true;
        int cnt=0;
        if(n<=4){
            return 0;
        }
       
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <=n; j++) {
                for (int k = j+1; k <=n; k++) {
                    if((i*i+j*j==k*k)){
                        cnt++;
                    }
                }
            }
        }

        return cnt*2;
    }

}
