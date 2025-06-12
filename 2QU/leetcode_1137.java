public class leetcode_1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }
     static int tribonacci(int n) {
        if (n < 1) {
            return n;
        } else {
            int firtsterm=0;
            int secondterm=1;
            int thirdterm=1;
            int fourth=0;
            for(int i=0;i<n;i++){
                fourth=firtsterm+secondterm+thirdterm;

                firtsterm=secondterm;
                secondterm=thirdterm;
                thirdterm=fourth;

                // firtsterm++;
                // secondterm++;
            }
            return firtsterm;
        }
    }
}
