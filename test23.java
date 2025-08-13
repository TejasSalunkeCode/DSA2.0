public class test23 {
    public static void main(String[] args) {
        int n = 15;
        int[][] queries = {
                { 0, 1 },
                { 2, 2 },
                { 0, 3 }
        };
        System.out.println(productQueries(15));
    }

    static int productQueries(int n) {
        int[] arr = new int[5];
        int ans=0,finals=0;

        int sum = 1;
        while (sum <= n) {
            System.out.println(sum);
            sum = sum * 2;
            ans=ans+sum;
           finals=ans-sum;
        }
        System.out.println("hjk "+finals);
        System.out.println("he : "+ans);
        return sum;

    }
}
