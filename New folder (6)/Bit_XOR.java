public class Bit_XOR {
    public static void main(String[] args) {
        int []arr={2,3,4,6,3,2,4};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr){
     int unique=0;
     for(int n : arr){
        unique^=n;
     }   

     return unique;
    }
}
