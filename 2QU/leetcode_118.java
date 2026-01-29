import java.util.ArrayList;
import java.util.List;

public class leetcode_118 {
    public static void main(String[] args) {
        
    }

    public static List<Integer> generateRow(int row){
        long ans=1;
        List<Integer> ansrow = new ArrayList<>();
        ansrow.add(1);

        for (int col = 1; col < row; col++) {
            ans=ans*(row-col);
            ans=ans/col;
            ansrow.add((int)ans);
        }
        return ansrow;
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <=numRows; i++) {
            ans.add(generateRow(i));
        }

        return ans;
    }

}
