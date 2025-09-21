public class _633_ {
    public static void main(String[] args) {
        int c = 8;
        System.out.println(judgeSquareSum(c));
    }

    static boolean judgeSquareSum(int c) {
        // int d=c/2;
        // int a1=0,a2=0;
        for (int i = 0; i <c-1; i++) {
            for (int j = 0; j <c; j++) {
                if(i*i+j*j==c){
                    return true;
                }
            }
        }
        return false;
    }
}
