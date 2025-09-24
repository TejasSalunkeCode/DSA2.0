import java.util.HashMap;
import java.util.Map;

public class leetcode_166 {
    public static void main(String[] args) {
        int numerator = 1, denominator = 2;
        System.out.println(fractionToDecimal(numerator, denominator));
    }
    static String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0){
            return "0";
        }

        //-ve
        StringBuilder result = new StringBuilder();
        if(numerator<0 && denominator>0){
            result.append("-");
        }else if(denominator < 0 && numerator>0){
            result.append("-");
        }

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        result.append(".");

        Map<Long,Integer> map = new HashMap<>();

        map.put(num, result.length());

        while (num!=0) {
            num=num*10;
            result.append(num/den);
            num=num%den;

            if(map.containsKey(num)){
                int index=map.get(num);
                result.insert(index, "(");
                result.append(")");
                break;
            }else{
                map.put(num, result.length());
            }
        }

        return result.toString();

    }
}
