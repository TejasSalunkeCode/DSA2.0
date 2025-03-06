public class factors {
    public static void main(String[] args) {
        findFact(20);
    }
    static void findFact(int n){
        int sum=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                System.out.print(i+",");
            }
        }
    }
}
