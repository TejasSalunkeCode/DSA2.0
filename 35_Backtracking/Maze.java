import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        // PrintPath(3, 3, "");
        // System.out.println(PrintList(3, 3, ""));
        // PrintPathDig(3, 3, "");
        PrintPathDigWithObs(0, 0, "");
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void PrintPath(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            PrintPath(r - 1, c, p + "d");
        }
        if (c > 1) {
            PrintPath(r, c - 1, p + "r");
        }
    }
      static void PrintPathDig(int r, int c, String p) {
        if (r ==21 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            PrintPathDig(r - 1, c, p + "V");
        }
        if (c > 1) {
            PrintPathDig(r, c - 1, p + "H");
        }
        if(c>1 || r>1){
            PrintPathDig(r-1, c - 1, p + "D--");
        }
    }


    static ArrayList<String> PrintList(int r, int c, String p) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(PrintList(r - 1, c, p + "d"));
        }
        if (c > 1) {
            list.addAll(PrintList(r, c - 1, p + "r"));
        }
        return list;
    }



    static void PrintPathDigWithObs(int r, int c, String p) {
        if (r == 2 && c == 2) {
            System.out.println(p);
            return;
        }
        if(r==1 && c==1){
            return;
        }
        // System.out.println("hello");
        if (r < 2) {
            PrintPathDigWithObs(r + 1, c, p + "V");
        }
        
        if (c < 2) {
            PrintPathDigWithObs(r, c +1, p + "H");
        }
        
        if(c<2 || r<2){
            PrintPathDigWithObs(r+1, c +1, p + "D--");
        }
    
    }
}
