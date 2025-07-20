package _42_oop.Object_Cloning;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34, "Shree");
        // Human twin = new Human(kunal);

        Human twin = (Human) kunal.clone();
        System.out.println(twin.age + "  " + twin.name);

    }
}
