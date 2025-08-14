public class demo3 {
    public static void main(String[] args) {
       String num="6777133339";
       System.out.println(largestGoodInteger(num));
    }

    static String largestGoodInteger(String num) {
        for (int i = 0; i < num.length(); i++) {
            String num1;
            if(num.charAt(i)==num.charAt(i+1)){
                num1=num1+num.charAt(i);
            }
        }
    }
}
