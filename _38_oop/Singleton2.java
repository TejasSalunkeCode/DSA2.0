package _38_oop;

public class Singleton2 {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstanse();
        Singleton obj2 = Singleton.getInstanse();
        Singleton obj3 = Singleton.getInstanse();
        System.out.println(obj == obj2); // true
        System.out.println(obj2 == obj3); // true
    }
}
