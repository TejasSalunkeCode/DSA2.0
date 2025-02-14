public class Comparator {
    public static void main(String[] args) {
        String a="Tejas";
        String b="Tejas";
        String c=a;

        // System.out.println(c==a);

        // System.out.println(a==b);

        String name1= new String("Tejas");
        String name2= new String("Tejas");

        System.out.println(name1==name2);

        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
    }
}
