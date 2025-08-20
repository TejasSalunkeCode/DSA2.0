import java.util.ArrayList;
import java.util.List;

public class testDaily {
    public static void main(String[] args) {
        String[] ops = { "5", "2", "C", "D", "+" };
        System.out.println(calPoints(ops));
    }

    static int calPoints(String[] operations) {
 List<Integer> stack = new ArrayList<>();

        for (String op : operations) {
            if (op.equals("C")) {
                stack.remove(stack.size() - 1);
            } else if (op.equals("D")) {
                stack.add(stack.get(stack.size() - 1) * 2);
            } else if (op.equals("+")) {
                int size = stack.size();
                stack.add(stack.get(size - 1) + stack.get(size - 2));
            } else {
                stack.add(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int score : stack) {
            total += score;
        }
        return total;
    }
}
