import Interface.breake;

public class testing {
    public static void main(String[] args) {
        int num = 100;
        // int[] baskets = { 6, 4, 7 };
        System.out.println(findPrime(num));
    }

    static int findPrime(int num) {
        int ans = 1;
        System.out.println();
        int count=0;
        for (int i = 3; i <= num; i++) {
            for (int j = 2; j <= num; j++) {
                if(i%j==0 && i!=j){
                    // System.out.println(i);
                    System.out.println(i);
                    count++;
                    break;

                }
                // break;
                // System.out.println();
            }
            // System.out.println(i);
        }
        count++;
        
        System.out.println("hel :"+count);
        System.out.println("hello");
        return num-count;
    }
}
