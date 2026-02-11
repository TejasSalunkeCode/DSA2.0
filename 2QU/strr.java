import java.util.Scanner;

public class strr {
    public static void main(String[] args) {
        String a="harshitam";
        String b="harsh";
        System.out.println(b.compareTo(a));

        // Scanner sc = new Scanner(System.in);
        // double n = sc.nextDouble();
        // String s = ""+n;
        // System.out.println(s.length());
        // System.out.println(s);
        String str="gopi";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                System.out.print(str.substring(i, j)+" ");
            }
            System.out.println();
        }

    }
}
